package tn.esprit.springfirst.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Pitste")
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
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "pistes")
    private List<Skier> skiers=new ArrayList<>();


}
