package com.projet.immob.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table (name = " \"client\"")

public class Client implements Serializable {
    @Id
    int id_client;
    private String nom;
    private String prenom;
    private Date date_de_naissance;
    private String email;
}
