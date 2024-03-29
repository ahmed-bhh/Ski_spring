package tn.esprit.springfirst.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Subscription")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Subscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSubscription")
    private int numSub;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;
    private float price;

    @ManyToOne
private Skier skier;
    @ManyToOne

    Course course;
@Enumerated(EnumType.STRING)
    private TypeSubscription typeSubscription;

}
