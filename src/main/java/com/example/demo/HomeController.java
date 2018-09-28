package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HomeController {



    @Autowired
    MovieService movieService;

    @GetMapping("")
    public String index(Model model){
        ArrayList<Movie> movies = movieService.findAll();

        model.addAttribute("movies", movies);

        return "index";
    }

    @GetMapping("/create")
    public String create (Model model){
        model.addAttribute("movies", new Movie());

        return "create";
    }

   /* @PostMapping("/create")
    public String create(@ModelAttribute Movie movies, Model model){

        //MovieService.save(movies);
        model.addAttribute("movies", new Movie());

        return  "create";
    }*/

    @GetMapping("/search")
    public String search (Model model){
        model.addAttribute("movies", new Movie());


        return "search";
    }

}
