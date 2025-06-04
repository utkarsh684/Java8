package com.example.nice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class NiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NiceApplication.class, args);
	}

}
