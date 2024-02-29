package tn.esprit.springfirst.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springfirst.entities.Piste;
import tn.esprit.springfirst.repositories.PisteRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class PisteServiceImpl implements IPisteService{
    PisteRepository pisteRepository;

    @Override
    public Piste add(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste update(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public void delete(Long id) {
        pisteRepository.deleteById(id);

    }

    @Override
    public List<Piste> getall() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste getbyid(Long id) {
        return pisteRepository.findById(id).get();
    }
}
