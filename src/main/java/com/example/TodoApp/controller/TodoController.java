package com.example.TodoApp.controller;

import com.example.TodoApp.model.Todo;
import com.example.TodoApp.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping()
    public List<Todo> getTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public List<Todo> getTodoById(@RequestBody Todo todo) {
        return todoService.getAllTodos();
    }

    @PostMapping()
    public Todo createTodo(@RequestBody Todo todo) {
        return todoService.createTodo(todo);
    }

    @PutMapping("/{id}")
    public Todo updateTodo(@RequestBody Todo todo) {
        return todoService.updateTodo(todo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodoById(@PathVariable Long id) {
        todoService.deleteTodoById(id);
    }
}
