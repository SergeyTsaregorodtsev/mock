package com.example.mock.dto;

import com.example.mock.common.BadUserPropertiesException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String login;
    private String password;
    private String data;

    public UserDto updateDto() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return new UserDto(getLogin(), null, LocalDateTime.now().format(formatter));
    }

    public void checkUserProperties() {
        if (((login == null) || (password == null)) ||
                (login.isBlank()) || password.isBlank()) {
            log.trace("Error: user properties (login/password) are missing.");
            throw new BadUserPropertiesException("User login or password is missing.");
        }
    }
}