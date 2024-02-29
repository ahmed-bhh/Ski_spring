package tn.esprit.springfirst.controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springfirst.entities.Instructor;
import tn.esprit.springfirst.entities.Skier;
import tn.esprit.springfirst.services.IInstructorService;

import java.util.List;
@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level= AccessLevel.PUBLIC)
@RequestMapping("/instructor")
public class InstructorController {
    IInstructorService instructorService;
    @GetMapping("/getall")
    public List<Instructor> getallinstructors(){
        return instructorService.getAllInstructors();
    }
    @GetMapping("/getbyid/{id}")
    public Instructor getInstructorById(@PathVariable Long id){
        return instructorService.getInstructorById(id);
    }
    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable Long id){
        instructorService.removeInstructor(id);
    }

    @PutMapping("/update")
    public Instructor updateInstructor(@RequestBody Instructor instructor){
        return instructorService.updateInstructor(instructor);
    }
    @PutMapping("/add")
    public Instructor add(@RequestBody Instructor instructor){
        return instructorService.addInstructor(instructor);
    }
}
