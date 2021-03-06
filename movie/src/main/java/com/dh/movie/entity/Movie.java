package com.dh.movie.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "movie")
@Data
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String genre;
    private String urlStream;
    private Long idCatalog;
}
