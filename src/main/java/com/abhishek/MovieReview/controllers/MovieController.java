package com.abhishek.MovieReview.controllers;

import com.abhishek.MovieReview.model.Movie;
import com.abhishek.MovieReview.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v0/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/all")
    public List<Movie> get(){
        return movieService.getAll();
    }
}
