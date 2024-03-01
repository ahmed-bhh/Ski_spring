package tn.esprit.springfirst.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springfirst.entities.Registration;
import tn.esprit.springfirst.repositories.RegistrationRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class RegistrationServiceImpl implements IRegistrationServiceImpl{
    RegistrationRepository registrationRepository;
    @Override
    public Registration add(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration update(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public void delete(Long id) {
        registrationRepository.deleteById(id);

    }

    @Override
    public List<Registration> getall() {
        return registrationRepository.findAll();
    }

    @Override
    public Registration getbyid(Long id) {
        return registrationRepository.findById(id).get();
    }
}
