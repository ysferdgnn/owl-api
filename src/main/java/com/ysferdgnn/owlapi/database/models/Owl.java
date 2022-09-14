package com.ysferdgnn.owlapi.database.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Owl")
@Data
public class Owl {

    @Column(name = "owlId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer owlId;

    @Column(name="commonName")
    private String commonName;

    @Column(name = "binomialName")
    private String binomialName;

    @Column(name = "femaleLenght")
    private Integer femaleLenght;

    @Column(name = "femaleWeight")
    private Integer femaleWeight;

    @Column(name = "maleWeight")
    private Integer maleWeight;

    @Column(name = "maleLenght")
    private Integer maleLenght;

}
