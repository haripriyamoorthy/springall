package com.movieapp.model.service;



import com.movieapp.model.Movie;
import com.movieapp.model.Moviedto;

import java.util.List;

public interface IMovieService {
    void addMovie(Moviedto moviedto);
    void  updateMovie( Moviedto moviedto);
    void deleteMovie(int movieId);
    Moviedto getMovieById(int movieId);
    List<Movie> getAllMovies();
    List<Movie> getByLanguage(String language);
    List<Movie> getByReleaseAndLanguage(int releaseYear, String language);
    List<Movie> getByGenreAndLanguage(String genre, String language);
    List<Movie> getByGenreAndFormat(String genre, String format);
}
