package tn.esprit.springfirst.controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springfirst.entities.Skier;
import tn.esprit.springfirst.services.ISkierService;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level= AccessLevel.PUBLIC)
@RequestMapping("/skiers")
public class SkierController {
    ISkierService skierService;
    @GetMapping("/getall")
    public List<Skier> getAllSkiers(){
        return skierService.retriveAllSkier();
    }
    @GetMapping("/getbyid/{id}")
    public Skier getSkierById(@PathVariable Integer id){
        return skierService.retriveSkier(id);
    }
    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable Integer id){
        skierService.removeSkier(id);
    }

    @PutMapping("/update")
    public Skier updateSkier(@RequestBody Skier skier){
        return skierService.updateSkier(skier);
    }
    @PutMapping("/add")
    public Skier addSkier(@RequestBody Skier skier){
        return skierService.addSkier(skier);
    }
}
