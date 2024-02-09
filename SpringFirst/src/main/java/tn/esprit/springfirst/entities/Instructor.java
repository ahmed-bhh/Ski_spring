package tn.esprit.springfirst.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="Instructor")
public class Instructor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInstructor")
    private Long numInstructor;
    private String firstName;

    private String LastName;

    private Date dateOfHire;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Course> courseSet;
}
