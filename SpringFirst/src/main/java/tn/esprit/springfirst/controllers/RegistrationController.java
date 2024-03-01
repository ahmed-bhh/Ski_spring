package tn.esprit.springfirst.controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springfirst.entities.Piste;
import tn.esprit.springfirst.entities.Registration;
import tn.esprit.springfirst.services.IRegistrationServiceImpl;

import java.util.List;
@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level= AccessLevel.PUBLIC)
@RequestMapping("/registration")
public class RegistrationController {
    IRegistrationServiceImpl registrationService;
    @GetMapping("/getall")
    public List<Registration> getAll(){
        return registrationService.getall();
    }
    @GetMapping("/getbyid/{id}")
    public Registration getbyid(@PathVariable Long id){
        return registrationService.getbyid(id);
    }
    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable Long id){
        registrationService.delete(id);
    }

    @PutMapping("/update")
    public Registration update(@RequestBody Registration registration){
        return registrationService.update(registration);
    }
    @PutMapping("/add")
    public Registration add(@RequestBody Registration registration){
        return registrationService.add(registration);
    }
}
