package com.example.cinema.enumerations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author <a href="mailto:andrew.guselnikov@test.com">Andrew Guselnikov</a>
 */
@JsonFormat
public enum Genre {
    HORROR("horror"),
    THRILLER("thriller"),
    COMEDY("comedy");


    private String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    @JsonCreator
    public static Genre fromValue(String text) {
        for (Genre genre : Genre.values()) {
            if (genre.genre.equalsIgnoreCase(text)) {
                return genre;
            }
        }
        return null;
    }

    @JsonValue
    public String toValue() {
        return this.genre;
    }
}
