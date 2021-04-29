package com.example.cinema.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author <a href="mailto:andrew.guselnikov@test.com">Andrew Guselnikov</a>
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {
    private String userName;
    private String password;
    private String role;

}
