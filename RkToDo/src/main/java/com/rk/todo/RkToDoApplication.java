package com.rk.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.rk.todo.repository")
@EntityScan(basePackages = "com.rk.todo.model")
@SpringBootApplication
public class RkToDoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RkToDoApplication.class, args);
	}

}
