package com.example.cinema.enumerations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author <a href="mailto:andrew.guselnikov@test.com">Andrew Guselnikov</a>
 */
@JsonFormat
public enum Category {

    TWELWE_PLUS("12+"),
    SIXTEEN_PLUS("16+"),
    THREE_D("3D");


    private String category;

    Category(String category) {
        this.category = category;
    }

    @JsonCreator
    public static Category fromValue(String text) {
        for (Category category : Category.values()) {
            if (category.category.equalsIgnoreCase(text)) {
                return category;
            }
        }
        return null;
    }

    @JsonValue
    public String toValue() {
        return this.category;
    }

}
