package tn.esprit.springfirst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springfirst.entities.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor,Long> {
}
