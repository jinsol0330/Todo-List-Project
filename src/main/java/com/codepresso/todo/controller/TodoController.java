package com.codepresso.todo.controller;

import java.util.List;

import com.codepresso.todo.service.TodoService;
import com.codepresso.todo.vo.ResultDto;
import com.codepresso.todo.vo.Todo;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getTodoList() {
        return todoService.getTodoList();
    }

    @PostMapping
    public ResultDto addTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo);
        return new ResultDto(200, "Success");
    }

    @DeleteMapping(value = "/{id}")
    public ResultDto deleteTodo(@PathVariable("id") Integer id) {
        todoService.deleteTodo(id);
        return new ResultDto(200, "Success");
    }

}
