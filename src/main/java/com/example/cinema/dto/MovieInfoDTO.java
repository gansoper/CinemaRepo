package com.example.cinema.dto;

import com.example.cinema.enumerations.Genre;
import lombok.Data;

import java.util.List;

/**
 * @author <a href="mailto:andrew.guselnikov@test.com">Andrew Guselnikov</a>
 */
@Data
public class MovieInfoDTO {
    private Integer year;
    private String country;
    private String producer;
    private String operator;
    // not all fields are here
    private Integer length;
    private List<Genre> genres;
}
