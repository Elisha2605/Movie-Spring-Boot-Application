package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MovieService {

    private ArrayList<Movie> movies = new ArrayList<>();

    public MovieService() {
        movies.add(new Movie("The Count of Monte Cristo", 2002, "2:14", "Drama"));
        movies.add(new Movie("Dirty Dancing", 1987, "1:40", "Drama/Romance"));
        movies.add(new Movie("Die Hard", 1988, "2:12", "Mystery/thriller"));
        movies.add(new Movie("The Lord of the Rings", 2001, "3:48", "Fantasy/action"));
        movies.add(new Movie("The Hangover Part II", 2011, "1:41", "Mystery/Farce"));
        movies.add(new Movie("Transformers", 2001, "2:24", "Fantasy/Science Fiction"));

    }

    //metod der returner alle film
    public ArrayList<Movie> findAll(){
        return movies;
    }
}
