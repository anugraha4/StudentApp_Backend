package com.nest.studentnew_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/")
    public String Homepage(){
        return "Welcome to my website";
    }

    @GetMapping("/contact")
    public String Contact(){
        return "Welcome to my contact page";
    }
    @GetMapping("/gallery")
    public String Gallery(){
        return "Welcome to gallery";
    }
}
