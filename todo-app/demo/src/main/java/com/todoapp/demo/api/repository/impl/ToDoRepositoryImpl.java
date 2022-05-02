package com.todoapp.demo.api.repository.impl;

import com.todoapp.demo.api.exception.GeneralError;
import com.todoapp.demo.api.model.ToDo;
import com.todoapp.demo.api.repository.ToDoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ToDoRepositoryImpl implements ToDoRepository {

    private List<ToDo> todos;

    public ToDoRepositoryImpl() {
        todos = new ArrayList<>();

        todos.add(new ToDo(1, "Do some work", false));

    }

    @Override
    public ToDo createToDoTask(ToDo toDo) throws GeneralError {

        if (toDo.getName().equals("I'm lazy"))
            throw new GeneralError();

        todos.add(toDo);

        return toDo;
    }

    @Override
    public List<ToDo> getToDoTasks() {
        return todos;
    }

    @Override
    public ToDo removeToDoTask(int id) throws GeneralError {

        for (ToDo todo: this.todos) {
            if (todo.getId() == id) {
                this.todos.remove(todo);
                return todo;
            }
        }
        throw new GeneralError();
    }

    @Override
    public ToDo updateToDoTask(int id, ToDo toDo) throws GeneralError {

        for (ToDo item: this.todos) {
            if (item.getId() == id) {
                item.setComplete(toDo.isComplete());
                item.setName(toDo.getName());
                return item;
            }
        }
        throw new GeneralError();
    }
}
