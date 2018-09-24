package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MovieService {

    private ArrayList<Movie> movies = new ArrayList<>();

    public MovieService() {
        movies.add(new Movie("The Count of Monte Cristo", "description", 2018, 2));
        movies.add(new Movie("title2", "description", 2018, 2));
        movies.add(new Movie("title3", "description", 2018, 2));
        movies.add(new Movie("title4", "description", 2018, 2));
        movies.add(new Movie("title5", "description", 2018, 2));
        movies.add(new Movie("title6", "description", 2018, 2));
    }

    //metod der returner alle film
    public ArrayList<Movie> findAll(){
        return movies;
    }
}
