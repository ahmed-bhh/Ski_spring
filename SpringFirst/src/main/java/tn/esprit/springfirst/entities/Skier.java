package tn.esprit.springfirst.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="Skier")
public class Skier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="numSkier")
private long numSkier;
private String firstName;
private String lastName;
@Temporal(TemporalType.DATE)
private Date dateOfBirth;

private String city;
    @ManyToMany
    @JoinTable( name = "join_piste_skier",
            joinColumns = @JoinColumn( name = "numSkier" ),
            inverseJoinColumns = @JoinColumn( name = "numPiste" ) )
private List<Piste> pistes=new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy="skier")
    private Set<Registration> registrationSet;

    @OneToOne
    Subscription subscription;

}
