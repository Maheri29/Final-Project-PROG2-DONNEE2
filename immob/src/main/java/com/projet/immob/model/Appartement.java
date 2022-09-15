package com.projet.immob.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table (name = "\"Appartement\"")

public class Appartement implements Serializable {
    @Id
    int id_appartement;
    private int nb_piece;
    private int loyer;

    @ManyToOne
    private Client client;
}
