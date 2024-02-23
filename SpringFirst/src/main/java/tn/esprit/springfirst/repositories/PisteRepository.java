package tn.esprit.springfirst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springfirst.entities.Piste;

public interface PisteRepository extends JpaRepository<Piste,Long> {
}
