package tn.esprit.springfirst.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name="Registration")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
