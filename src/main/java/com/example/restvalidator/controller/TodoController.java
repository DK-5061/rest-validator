package com.example.restvalidator.controller;

import com.example.restvalidator.exception.TodoNotFoundException;
import com.example.restvalidator.model.Todo;
import com.example.restvalidator.service.TodoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todo/{id}")
    public Todo getTodos(@PathVariable() Long id) {
        return todoService.getTodo(id).orElseThrow(() -> new TodoNotFoundException(id));
    }

    @GetMapping("/todos")
    public List<Todo> getTodos() {
        return todoService.getTodos();
    }

}
