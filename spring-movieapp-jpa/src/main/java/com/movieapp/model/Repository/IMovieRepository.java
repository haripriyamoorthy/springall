package com.movieapp.model.Repository;



import com.movieapp.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMovieRepository extends JpaRepository<Movie, Integer> {
    List<Movie> findByLanguage(String language);
    List<Movie> findByReleaseYearAndLanguage(int releaseYear, String language);
    List<Movie> findByGenreAndLanguage(String genre, String language);
    List<Movie> findByGenreAndFormat(String genre, String format);
}
