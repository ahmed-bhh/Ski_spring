package tn.esprit.springfirst.services;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springfirst.entities.Skier;
import tn.esprit.springfirst.repositories.SkierRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class SkierServiceImpl implements ISkierService{
    SkierRepository skierRepository;

    @Override
    public Skier addSkier(Skier skier) {

        return skierRepository.save(skier);
    }

    @Override
    public Skier updateSkier(Skier skier) {

        return skierRepository.save(skier);
    }

    @Override
    public void removeSkier(Integer idSkier) {
        skierRepository.deleteById(idSkier);

    }

    @Override
    public Skier retriveSkier(Integer idSkier) {
        return skierRepository.findById(idSkier).get();
    }

    @Override
    public List<Skier> retriveAllSkier() {
        return skierRepository.findAll();
    }
}
