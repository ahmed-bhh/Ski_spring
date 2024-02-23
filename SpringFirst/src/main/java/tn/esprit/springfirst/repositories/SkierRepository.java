package tn.esprit.springfirst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springfirst.entities.Skier;

public interface SkierRepository extends JpaRepository<Skier,Long> {

}
