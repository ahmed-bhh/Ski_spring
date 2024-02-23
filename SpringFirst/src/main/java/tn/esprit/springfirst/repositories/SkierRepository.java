package tn.esprit.springfirst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springfirst.entities.Skier;
@Repository
public interface SkierRepository extends JpaRepository<Skier,Integer> {

}
