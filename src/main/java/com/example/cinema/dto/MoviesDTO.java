package com.example.cinema.dto;

import com.example.cinema.enumerations.Category;
import lombok.Data;

import java.util.List;

/**
 * @author <a href="mailto:andrew.guselnikov@test.com">Andrew Guselnikov</a>
 */
@Data
public class MoviesDTO {
    private String id;
    private String imgUrl;
    private String shortDesc;
    private List<Category> categories;
}
