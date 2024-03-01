package tn.esprit.springfirst.services;

import tn.esprit.springfirst.entities.Registration;

import java.util.List;

public interface IRegistrationServiceImpl {
    Registration add(Registration registration);
    Registration update(Registration registration);

    void delete(Long id);

    List<Registration> getall();
    Registration getbyid(Long id);
}
