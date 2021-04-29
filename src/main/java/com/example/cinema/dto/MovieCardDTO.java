package com.example.cinema.dto;

import lombok.Data;

import java.util.List;

/**
 * @author <a href="mailto:andrew.guselnikov@test.com">Andrew Guselnikov</a>
 */
@Data
public class MovieCardDTO {
    private String id;
    private String urlPreview;
    private String mainImgUrl;
    private List<String> carouselImages;
    private String description;
    private MovieInfoDTO movieInfo;
    // TODO: think about Cinema schedule (part big enough) - need to be implemented as separate API and model part.

}
