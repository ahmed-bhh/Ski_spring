package tn.esprit.springfirst.services;

import tn.esprit.springfirst.entities.Skier;

import java.util.List;

public interface ISkierService {
    Skier addSkier(Skier skier);
    Skier updateSkier(Skier skier);
    void removeSkier(Integer idSkier);

    Skier retriveSkier(Integer idSkier);

    List<Skier> retriveAllSkier();




}
