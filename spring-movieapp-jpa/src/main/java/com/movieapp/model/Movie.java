package com.movieapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    @GeneratedValue
    private Integer movieId;
    @Column(length=20)
    private String title;
    @Column(length=30)
    private int releaseYear;
    @Column(length=30)
    private String language;
    @Column(length=30)
    private String genre;
    @Column(length=30)
    private String format;// e.g., 2D or 3D
    @Column(length=30)
    private String director;
}
