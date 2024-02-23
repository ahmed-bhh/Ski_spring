package tn.esprit.springfirst.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springfirst.repositories.SkierRepository;

@Service
@AllArgsConstructor
public class SkierServiceImpl implements ISkierService{
    SkierRepository skierRepository;
}
