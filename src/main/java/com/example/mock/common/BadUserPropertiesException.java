package com.example.mock.common;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class BadUserPropertiesException extends RuntimeException{
    public BadUserPropertiesException(String message) {
        super(message);
    }
}