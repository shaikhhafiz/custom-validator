package com.hafiz.customvalidator.exception.handlers;

import lombok.Data;

@Data
public class InvalidInput extends Exception {
    private String message;

    public InvalidInput(String message) {
        this.message = message;
    }
}
