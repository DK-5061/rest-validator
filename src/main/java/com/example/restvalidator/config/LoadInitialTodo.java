package com.example.restvalidator.config;

import com.example.restvalidator.model.Todo;
import com.example.restvalidator.model.TodoRepository;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LoadInitialTodo {

    public LoadInitialTodo(TodoRepository todoRepository) {

        List<Todo> todos = List.of(
                Todo.builder()
                        .description("Write a fantastic project !!!")
                        .build(),
                Todo.builder()
                        .description("Take a rest !!!")
                        .build());

        todoRepository.saveAll(todos);

    }
}
