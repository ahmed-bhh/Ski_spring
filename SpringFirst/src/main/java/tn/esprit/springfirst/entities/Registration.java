package tn.esprit.springfirst.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="Registration")
public class Registration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRegistration")
    private long numRegistration;
    private int numWeek;

    @ManyToOne
     Skier skier;
    @ManyToOne
    Course course;

}
