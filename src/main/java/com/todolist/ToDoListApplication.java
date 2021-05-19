package com.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.todolist.repositories")
public class ToDoListApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ToDoListApplication.class, args);
    }
}
