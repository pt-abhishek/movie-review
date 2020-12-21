package com.abhishek.MovieReview.dao;


import com.abhishek.MovieReview.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieDao extends JpaRepository<Movie, String> {
    List<Movie> findByIdIn(List<Integer> ids);
}