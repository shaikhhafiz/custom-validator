package com.hafiz.customvalidator.exception.handlers;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(InvalidInput.class)
    public String handleInvalidInput(InvalidInput ex) {
        return ex.getMessage();
    }
}
