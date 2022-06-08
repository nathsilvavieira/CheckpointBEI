package com.dh.catalog.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Catalog")
@Data
public class Catalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String genre;
    private String urlStream;

}
