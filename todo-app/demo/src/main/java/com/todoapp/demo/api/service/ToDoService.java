package com.todoapp.demo.api.service;

import com.todoapp.demo.api.exception.GeneralError;
import com.todoapp.demo.api.model.ToDo;

import java.util.List;

public interface ToDoService {

    ToDo createToDoTask(ToDo toDo) throws GeneralError;

    List<ToDo> getToDoTasks();

    ToDo removeToDoTask(int id) throws GeneralError;

    ToDo updateToDoTask(int id, ToDo toDo) throws GeneralError;

}
