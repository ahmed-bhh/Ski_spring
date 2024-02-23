package tn.esprit.springfirst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springfirst.entities.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription,Integer> {
}
