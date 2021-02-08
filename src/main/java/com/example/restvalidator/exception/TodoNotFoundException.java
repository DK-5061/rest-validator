package com.example.restvalidator.exception;

public class TodoNotFoundException extends RuntimeException {

    public TodoNotFoundException(Long id) {
        super("Could not found Todo with given id: " + id);
    }

}
