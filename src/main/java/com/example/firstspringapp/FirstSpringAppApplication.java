package com.example.firstspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringAppApplication {

    public static void main(String[] args) {
        System.out.println("Hello World");
        SpringApplication.run(FirstSpringAppApplication.class, args);
    }

}
