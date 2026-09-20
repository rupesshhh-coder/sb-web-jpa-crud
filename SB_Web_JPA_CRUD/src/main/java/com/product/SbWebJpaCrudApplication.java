package com.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbWebJpaCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbWebJpaCrudApplication.class, args);
		System.err.println("===== WELCOME SPRING-BOOT HIBERNATE =====");
	}

}
