package tn.esprit.springfirst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springfirst.entities.Piste;
@Repository

public interface PisteRepository extends JpaRepository<Piste,Long> {
}
