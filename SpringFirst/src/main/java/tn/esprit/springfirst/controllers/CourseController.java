package tn.esprit.springfirst.controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springfirst.entities.Course;
import tn.esprit.springfirst.entities.Skier;
import tn.esprit.springfirst.services.ICourseService;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level= AccessLevel.PUBLIC)
@RequestMapping("/course")
public class CourseController {
    ICourseService courseService;
    @GetMapping("/getall")
    public List<Course> getAllSkiers(){
        return courseService.getAllCourses();
    }
    @GetMapping("/getbyid/{id}")
    public Course getSkierById(@PathVariable Integer id){
        return courseService.getCourseById(id);
    }
    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable Integer id){
        courseService.removeCourse(id);
    }

    @PutMapping("/update")
    public Course updateSkier(@RequestBody Course course){
        return courseService.updateCourse(course);
    }
    @PutMapping("/add")
    public Course addSkier(@RequestBody Course c){
        return courseService.addCours(c);
    }
}
