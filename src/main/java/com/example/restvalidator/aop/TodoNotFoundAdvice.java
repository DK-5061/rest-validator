package com.example.restvalidator.aop;

import com.example.restvalidator.exception.TodoNotFoundException;
import com.example.restvalidator.model.TodoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class TodoNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(TodoNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public TodoResponse todoNotFoundHandler(TodoNotFoundException ex) {
        return TodoResponse.builder()
                .message(ex.getMessage())
                .build();
    }
}
