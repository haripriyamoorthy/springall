package com.movieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.movieapp.model.Moviedto;
import com.movieapp.model.service.IMovieService;

@SpringBootApplication
public class SpringMovieappJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringMovieappJpaApplication.class, args);
	}
	@Autowired
	private IMovieService MovieService;

	@Override
	public void run(String... args) throws Exception {
		
		
		Moviedto MovieDto =  new Moviedto(null,"samy",2006,"tamil","family","2D","ARMURUGADOSS");
		//call the method of service layer;
		MovieService.addMovie(MovieDto);
		
		Moviedto nMovieDto = MovieService.getMovieById(1);
		System.out.println(nMovieDto);
		
		//update- call setter methods
		nMovieDto.setDirector("arrahman");
		MovieService.updateMovie(nMovieDto);
		

	}
}
