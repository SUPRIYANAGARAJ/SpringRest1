package com.skillsoft.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class RestSubTask2Application {

	public static void main(String[] args) {
		SpringApplication.run(RestSubTask2Application.class, args);
	}

}
