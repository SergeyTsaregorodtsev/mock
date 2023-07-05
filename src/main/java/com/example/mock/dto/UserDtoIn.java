package com.example.mock.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class UserDtoIn {
    @NotBlank
    private String login;
    @NotBlank
    private String password;
}