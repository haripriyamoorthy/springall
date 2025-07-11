package com.movieapp.model.service;


import com.movieapp.model.exception.MovieNotFoundException;

import com.movieapp.model.Moviedto;
import com.movieapp.model.Movie;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieapp.model.Repository.IMovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service

public class MovieServiceImpl implements IMovieService {

    private  IMovieRepository movieRepository;
    public MovieServiceImpl(IMovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Autowired
	private ModelMapper mapper;
	
   

    @Override
    public void deleteMovie(int movieId) {
        movieRepository.deleteById(movieId);
    }

    @Override
    public Moviedto getMovieById(int movieId) {
    	Movie mov = movieRepository.findById(movieId)
				.orElseThrow(()->new MovieNotFoundException("invalid id"));
	return mapper.map(mov, Moviedto.class);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public List<Movie> getByLanguage(String language) {
        return movieRepository.findByLanguage(language);
    }

    @Override
    public List<Movie> getByReleaseAndLanguage(int releaseYear, String language) {
        return movieRepository.findByReleaseYearAndLanguage(releaseYear, language);
    }

    @Override
    public List<Movie> getByGenreAndLanguage(String genre, String language) {
        return movieRepository.findByGenreAndLanguage(genre, language);
    }

    @Override
    public List<Movie> getByGenreAndFormat(String genre, String format) {
        return movieRepository.findByGenreAndFormat(genre, format);
    }

	@Override
	public void addMovie(Moviedto moviedto) {
		// TODO Auto-generated method stub
		Movie movie = mapper.map(moviedto, Movie.class);
        movieRepository.save(movie);
    
	}

	@Override
	public void updateMovie(Moviedto moviedto) {
		// TODO Auto-generated method stub
		Movie movie = mapper.map(moviedto, Movie.class);
		// product should have id in it - then updates it
		 movieRepository.save(movie);
		
		
	}
}

