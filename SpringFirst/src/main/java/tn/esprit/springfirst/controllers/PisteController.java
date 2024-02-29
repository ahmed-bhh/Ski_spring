package tn.esprit.springfirst.controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springfirst.entities.Piste;
import tn.esprit.springfirst.entities.Skier;
import tn.esprit.springfirst.services.IPisteService;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level= AccessLevel.PUBLIC)
@RequestMapping("/piste")
public class PisteController {
    IPisteService iPisteService;
    @GetMapping("/getall")
    public List<Piste> getAll(){
        return iPisteService.getall();
    }
    @GetMapping("/getbyid/{id}")
    public Piste getbyid(@PathVariable Long id){
        return iPisteService.getbyid(id);
    }
    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable Long id){
        iPisteService.delete(id);
    }

    @PutMapping("/update")
    public Piste update(@RequestBody Piste piste){
        return iPisteService.update(piste);
    }
    @PutMapping("/add")
    public Piste add(@RequestBody Piste piste){
        return iPisteService.add(piste);
    }



}
