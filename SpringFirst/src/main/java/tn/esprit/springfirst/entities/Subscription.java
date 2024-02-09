package tn.esprit.springfirst.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Subscription")
public class Subscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSubscription")
    private int numSub;
    private Date startDate;
    private Date endDate;

    private float price;
@Enumerated(EnumType.STRING)
    private TypeSubscription typeSubscription;

}
