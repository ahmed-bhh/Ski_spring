package tn.esprit.springfirst.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Course")
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCourse")
    private Long numCourse;
    private  int level;
    @Enumerated(EnumType.STRING)
private TypeCourse typeCourse;
    @Enumerated(EnumType.STRING)
    private Support support;

    private float price;

    private int timeSlot;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "course")
    private Set<Registration> registrationSet;
    


}
