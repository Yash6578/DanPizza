package com.accenture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.accenture.pizza.entity")
public class DanPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DanPizzaApplication.class, args);
	}

}
