package com.example.cinema.service;

import com.example.cinema.dto.MovieCardDTO;
import com.example.cinema.dto.MoviesDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

/**
 * @author <a href="mailto:andrew.guselnikov@test.com">Andrew Guselnikov</a>
 */
@Service
public class MovieService {

    public Page<MoviesDTO> getMovieCards( Pageable pageable, String searchText) {
        return new PageImpl<>(Collections.singletonList(new MoviesDTO()));
    }

    public MovieCardDTO getMovieCard(String id) {
        return new MovieCardDTO();
    }

    public void deleteMovieCard(String id) {

    }

    public MovieCardDTO updateMovieCard( String id, MovieCardDTO movieCardDTO) {
        return movieCardDTO;
    }

    public MovieCardDTO createMovie(MovieCardDTO movieCardDTO) {
        return movieCardDTO;
    }

}
