package com.example.restvalidator.service;

import com.example.restvalidator.model.Todo;
import com.example.restvalidator.model.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Optional<Todo> getTodo(Long id) {
        return todoRepository.findById(id);
    }

    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }
}
