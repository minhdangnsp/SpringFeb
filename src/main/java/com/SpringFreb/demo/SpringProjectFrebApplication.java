package com.SpringFreb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.SpringFreb.Entities")
@EnableJpaRepositories("com.SpringFreb.Repository")
@ComponentScan("com.SpringFreb.*")
public class SpringProjectFrebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectFrebApplication.class, args);
	}

}
