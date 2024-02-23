package tn.esprit.springfirst.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.yaml.snakeyaml.DumperOptions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="Skier")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Skier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="numSkier")
private Integer numSkier;
private String firstName;
private String lastName;
@Temporal(TemporalType.DATE)
private Date dateOfBirth;

private String city;
    @ManyToMany(cascade = CascadeType.ALL)
private List<Piste> pistes=new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy="skier")
    private Set<Registration> registrationSet;

    @OneToOne(cascade = CascadeType.ALL)
    Subscription subscription;

}
