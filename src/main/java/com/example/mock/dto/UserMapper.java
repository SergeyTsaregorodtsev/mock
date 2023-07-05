package com.example.mock.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserMapper {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    public static UserDtoOut toDtoOut(UserDtoIn user) {
        return new UserDtoOut(user.getLogin(), LocalDateTime.now().format(formatter));
    }
}