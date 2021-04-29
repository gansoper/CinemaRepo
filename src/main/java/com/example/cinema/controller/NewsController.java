package com.example.cinema.controller;

import com.example.cinema.dto.NewsDTO;
import com.example.cinema.dto.NewsDetailsDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author <a href="mailto:andrew.guselnikov@test.com">Andrew Guselnikov</a>
 */
@RestController
@RequestMapping("/v1/news")
public class NewsController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<NewsDTO> getNews(@PageableDefault(size = 10) Pageable pageable, @RequestParam(value = "searchText", required = false) String searchText) {
        return null;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public NewsDetailsDTO getNewsDetails(@PathVariable("id") String id) {
        return null;
    }

}
