package com.example.cinema.dto;

import lombok.Data;

import java.time.LocalDate;

/**
 * @author <a href="mailto:andrew.guselnikov@test.com">Andrew Guselnikov</a>
 */
@Data
public class NewsDetailsDTO {
    private String id;
    private String shortDescription;
    private LocalDate newsDate;
    private String description;
    private String imgUrl;
}
