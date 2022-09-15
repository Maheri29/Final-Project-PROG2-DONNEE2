package com.projet.immob.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = " \"quartier\"")
public class Quartier implements Serializable {
    @Id
    int id_quartier;
    private String arrondissement;
    private int nb_immeuble;
}
