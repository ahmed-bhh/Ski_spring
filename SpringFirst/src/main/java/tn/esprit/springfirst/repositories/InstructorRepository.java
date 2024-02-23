package tn.esprit.springfirst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springfirst.entities.Instructor;
@Repository

public interface InstructorRepository extends JpaRepository<Instructor,Long> {
}
