package tn.esprit.springfirst.services;

import tn.esprit.springfirst.entities.Piste;

import java.util.List;

public interface IPisteService {
     Piste add(Piste piste);
     Piste update(Piste piste);

     void delete(Long id);

     List<Piste> getall();
     Piste getbyid(Long id);

}
