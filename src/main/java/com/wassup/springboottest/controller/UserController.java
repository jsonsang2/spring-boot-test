package com.wassup.springboottest.controller;

import com.wassup.springboottest.model.dto.UserDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @GetMapping(value = "/v1/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserDto> getUsers() {
        return List.of(new UserDto("Json"), new UserDto("BongBong"));
    }
}
