package com.example.mock.controller;

import com.example.mock.dto.UserDto;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping
public class MockController {
    static Gson gson = new Gson();

    @PostMapping(path = "/api/post")
    public UserDto postRequest(@RequestBody UserDto user) {
        user.checkUserProperties();
        log.trace("Получен POST-запрос на пользователя {} / {}.", user.getLogin(), user.getPassword());
        return user.updateDto();
    }

    @GetMapping(path = "/api/get")
    public String getRequest() {
        log.trace("Получен GET-запрос.");
        return gson.toJson("Test string");
    }
}