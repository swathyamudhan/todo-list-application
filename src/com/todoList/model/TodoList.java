package com.todoList.model;

import java.time.LocalDateTime;

public class TodoList{

    private String title;

    Task[] tasks = new Task[2];

    final LocalDateTime createdAt = LocalDateTime.now();

    private int size = 0;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    // public LocalDateTime getCreatedAt(){
    //     return createdAt;
    // }

    public void addTask(Task task){
        if(tasks.length > size){
            tasks[size] = task;
        } else {
            int length = tasks.length;
            Task[] tempTasks = new Task[length*2];
            for(int i=0;i<length;i++){
                tempTasks[i] = tasks[i];
            }
            tempTasks[size]=task;
            tasks = tempTasks;
        }
        size++;
    }

    @Override
    public String toString(){
        return "Title:"+title+", Tasks count :"+size+", Created at :"+createdAt;
    }


    
}