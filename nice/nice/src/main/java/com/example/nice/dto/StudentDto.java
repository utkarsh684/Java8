package com.example.nice.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class StudentDto {
    @NotBlank(message = "Name is mandatory")
    private String name;

    @Min(value = 10, message = "Minimum age is 10")
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

