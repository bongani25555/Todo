package com.todoapp.demo.api.service.impl;

import com.todoapp.demo.api.exception.GeneralError;
import com.todoapp.demo.api.model.ToDo;
import com.todoapp.demo.api.repository.ToDoRepository;
import com.todoapp.demo.api.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService {

    private ToDoRepository toDoRepository;

    @Autowired
    public ToDoServiceImpl(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @Override
    public ToDo createToDoTask(ToDo toDo) throws GeneralError {
        return this.toDoRepository.createToDoTask(toDo);
    }

    @Override
    public List<ToDo> getToDoTasks() {
        return this.toDoRepository.getToDoTasks();
    }

    @Override
    public ToDo removeToDoTask(int id) throws GeneralError {
        return this.toDoRepository.removeToDoTask(id);
    }

    @Override
    public ToDo updateToDoTask(int id, ToDo toDo) throws GeneralError {
        return this.toDoRepository.updateToDoTask(id, toDo);
    }
}
