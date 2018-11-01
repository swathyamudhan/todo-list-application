package com.todoList.model;

import java.time.LocalDateTime;

public class Task{

    String name;
    
    final LocalDateTime createdAt = LocalDateTime.now();

    public Task(String name){
        this.name = name;
    }

}