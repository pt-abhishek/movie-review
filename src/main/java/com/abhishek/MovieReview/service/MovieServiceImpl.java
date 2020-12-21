package com.abhishek.MovieReview.service;

import com.abhishek.MovieReview.dao.MovieDao;
import com.abhishek.MovieReview.model.Movie;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDao movieDao;

    private final Logger logger = LoggerFactory.getLogger(MovieServiceImpl.class);

    @Override
    public List<Movie> getAll(){
        List<Movie> movies =  movieDao.findAll();
        logger.debug("movies are {}", movies);
        return movies;
    }

}
