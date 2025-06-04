package com.example.nice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nice.entity.Student;


@RestController
public class StudentController {

    @RequestMapping("/hello")
    public Student index() {
        return new Student((long) 1,"Utkarsh",19);
    }

}
