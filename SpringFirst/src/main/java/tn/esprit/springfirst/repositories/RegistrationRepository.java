package tn.esprit.springfirst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springfirst.entities.Registration;
@Repository

public interface RegistrationRepository extends JpaRepository<Registration,Long> {
}
