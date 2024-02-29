package tn.esprit.springfirst.services;

import tn.esprit.springfirst.entities.Course;
import tn.esprit.springfirst.entities.Instructor;

import java.util.List;

public interface IInstructorService {
    Instructor addInstructor(Instructor i);
    Instructor updateInstructor(Instructor i);
    List<Instructor> getAllInstructors();
    Instructor getInstructorById(Long id);

    void removeInstructor(Long id);
}
