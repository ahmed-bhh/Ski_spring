package tn.esprit.springfirst.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="TPliste")
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPiste")
    private long numPiste;
    private String namePiste;
    @Enumerated(EnumType.STRING)
    private  Color color;

    private int length;
    private int slope;

}
