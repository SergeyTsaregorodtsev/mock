package com.example.mock.controller;

import com.example.mock.dto.UserDtoIn;
import com.example.mock.dto.UserDtoOut;
import com.example.mock.dto.UserMapper;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping(path = "/mock")
public class MockController {
    static Gson gson = new Gson();

    @PostMapping
    public UserDtoOut postRequest(@Valid @RequestBody UserDtoIn user) {
        log.trace("Получен POST-запрос на пользователя {} / {}.", user.getLogin(), user.getPassword());
        return UserMapper.toDtoOut(user);
    }

    @GetMapping
    public String getRequest() {
        log.trace("Получен GET-запрос.");
        return gson.toJson("Test string");
    }
}