package tn.esprit.springfirst.services;

import tn.esprit.springfirst.entities.Course;

import java.util.List;

public interface ICourseService {
 Course addCours(Course c);
 Course updateCourse(Course c);
 List<Course> getAllCourses();
 Course getCourseById(Integer id);

 void removeCourse(Integer id);
}
