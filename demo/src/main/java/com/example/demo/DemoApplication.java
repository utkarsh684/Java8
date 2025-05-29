package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

public class DemoApplication {

	public static void main(String[] args) {
		Employee employee = () -> "Software Engineer";
		System.out.println(employee.getName());
		SpringApplication.run(DemoApplication.class, args);
		
	}

}
