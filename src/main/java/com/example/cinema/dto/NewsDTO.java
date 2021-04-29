package com.example.cinema.dto;

import lombok.Data;

import java.time.LocalDate;

/**
 * @author <a href="mailto:c-andrii.guselnikov@test.com">Andrii Guselnikov</a>
 */
@Data
public class NewsDTO {
    private String id;
    private String shortDescription;
    private  LocalDate newsDate;
    private String description;
    private String imgUrl;
}
