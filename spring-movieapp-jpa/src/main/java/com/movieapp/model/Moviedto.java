package com.movieapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Moviedto {

    
    private Integer movieId;
    
    private String title;
   
    private int releaseYear;
   
    private String language;
    
    private String genre;
    
    private String format;// e.g., 2D or 3D
    
    private String director;
}
