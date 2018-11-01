package com.todoList;

import com.todoList.model.TodoList;
import com.todoList.model.Task;

public class TodoListMain{
    public static void main(String...args) {

        TodoList todoList1 = new TodoList();

        todoList1.setTitle("StudyPlan");
        
        Task t1 = new Task("Wakeup");
        Task t2 = new Task("Brush");
        Task t3 = new Task("Drink");
        Task t4 = new Task("Eat");

        todoList1.addTask(t1);
        todoList1.addTask(t2);
        todoList1.addTask(t3);
        todoList1.addTask(t4);

        System.out.println(todoList1);

        
    }
}