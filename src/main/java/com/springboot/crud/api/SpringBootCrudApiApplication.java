package com.springboot.crud.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories("com.springboot.crud.api.repository")
public class SpringBootCrudApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApiApplication.class, args);
	}
}
