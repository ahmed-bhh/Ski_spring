package tn.esprit.springfirst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springfirst.entities.Course;
@Repository

public interface CourseRepository extends JpaRepository<Course,Integer> {
}
