package com.example.cinema.controller.admin;

import com.example.cinema.dto.MovieCardDTO;
import com.example.cinema.dto.MoviesDTO;
import com.example.cinema.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


/**
 * @author <a href="mailto:andrew.guselnikov@test.com">Andrew Guselnikov</a>
 */
@RestController
@AllArgsConstructor
@RequestMapping("/admin/v1/movies")
public class AdminMoviesController {

    private final MovieService movieService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<MoviesDTO> getMovieCards(@PageableDefault(size = 10) Pageable pageable, @RequestParam(value = "searchText", required = false) String searchText) {
        return movieService.getMovieCards(pageable, searchText);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MovieCardDTO getMovieCard(@PathVariable("id") String id) {
        return movieService.getMovieCard(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteMovieCard(@PathVariable("id") String id) {
        movieService.deleteMovieCard(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MovieCardDTO updateMovieCard(@PathVariable("id") String id, @RequestBody MovieCardDTO movieCardDTO) {
        return movieService.updateMovieCard(id, movieCardDTO);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MovieCardDTO createMovie(@RequestBody MovieCardDTO movieCardDTO) {
        return movieService.createMovie(movieCardDTO);
    }


}
