package com.example.spring.security.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = {IllegalArgumentException.class, NullPointerException.class})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Bad Request")
    public String handleException(Exception e) {
        return e.getMessage();
    }
}
