package tn.esprit.springfirst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springfirst.entities.Course;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
