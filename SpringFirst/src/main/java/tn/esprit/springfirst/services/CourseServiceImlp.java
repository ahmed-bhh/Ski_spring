package tn.esprit.springfirst.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springfirst.entities.Course;
import tn.esprit.springfirst.repositories.CourseRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class CourseServiceImlp implements ICourseService{
    CourseRepository courseRepository;
    @Override
    public Course addCours(Course c) {
        return courseRepository.save(c);
    }

    @Override
    public Course updateCourse(Course c) {
        return courseRepository.save(c);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(Integer id) {
        return courseRepository.findById(id).get();
    }

    @Override
    public void removeCourse(Integer id) {
        courseRepository.deleteById(id);

    }
}
