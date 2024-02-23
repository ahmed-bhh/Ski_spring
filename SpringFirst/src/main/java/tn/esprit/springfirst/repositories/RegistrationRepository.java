package tn.esprit.springfirst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springfirst.entities.Registration;

public interface RegistrationRepository extends JpaRepository<Registration,Long> {
}
