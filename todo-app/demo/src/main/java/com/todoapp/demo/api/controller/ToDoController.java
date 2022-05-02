package com.todoapp.demo.api.controller;

import com.todoapp.demo.api.exception.GeneralError;
import com.todoapp.demo.api.model.ToDo;
import com.todoapp.demo.api.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class ToDoController {

    private ToDoService toDoService;

    @Autowired
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping()
    public ResponseEntity<List<ToDo>> getToDoTasks() throws GeneralError {

        return ResponseEntity.ok(toDoService.getToDoTasks());
    }

    @PostMapping("/create")
    public ResponseEntity<ToDo> addToDoTask(@RequestBody ToDo toDo) throws GeneralError {

        return ResponseEntity.ok(toDoService.createToDoTask(toDo));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ToDo> updateToDoTask(@PathVariable(value="id", required = true) int id,
                                               @RequestBody ToDo toDo) throws GeneralError {

        return ResponseEntity.ok(toDoService.updateToDoTask(id, toDo));
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<ToDo> removeToDoTask(@PathVariable(value="id", required = true) int id) throws GeneralError {

        return ResponseEntity.ok(toDoService.removeToDoTask(id));
    }
}
