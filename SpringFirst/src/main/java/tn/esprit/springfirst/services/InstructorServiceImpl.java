package tn.esprit.springfirst.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springfirst.entities.Instructor;
import tn.esprit.springfirst.repositories.InstructorRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class InstructorServiceImpl implements IInstructorService{
    InstructorRepository instructorRepository;
    @Override
    public Instructor addInstructor(Instructor i) {
        return instructorRepository.save(i);
    }

    @Override
    public Instructor updateInstructor(Instructor i) {
        return instructorRepository.save(i);
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return instructorRepository.findAll();
    }

    @Override
    public Instructor getInstructorById(Long id) {
        return instructorRepository.findById(id).get();//dima naamlou .get()
    }

    @Override
    public void removeInstructor(Long id) {
        instructorRepository.deleteById(id);

    }
}
