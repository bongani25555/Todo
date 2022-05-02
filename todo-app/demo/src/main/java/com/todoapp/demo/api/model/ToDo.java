package com.todoapp.demo.api.model;

public class ToDo {

    private int id;
    private String name;
    private boolean isComplete;

    public ToDo(int id, String name, boolean isComplete) {
        this.id = id;
        this.name = name;
        this.isComplete = isComplete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
