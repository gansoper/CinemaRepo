package com.example.cinema.controller;

import com.example.cinema.dto.UserDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author <a href="mailto:andrew.guselnikov@test.com">Andrew Guselnikov</a>
 */
@RestController
public class LoginController {

    @PostMapping("/login")
    public HttpEntity<UserDTO> login(@RequestParam String userName, @RequestParam String password) {
        return new HttpEntity<>(new UserDTO());
    }


    @PostMapping("/register")
    public HttpEntity<UserDTO> register(@RequestBody UserDTO user) {
        return new HttpEntity<>(user);
    }

    @PostMapping("/logout")
    @ResponseStatus(HttpStatus.OK)
    public void logout() {

    }

}
