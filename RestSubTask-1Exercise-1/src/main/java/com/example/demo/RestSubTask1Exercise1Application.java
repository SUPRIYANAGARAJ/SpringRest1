package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class RestSubTask1Exercise1Application {

	public static void main(String[] args) {
		SpringApplication.run(RestSubTask1Exercise1Application.class, args);
	}

}
