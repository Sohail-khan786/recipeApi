package com.example.recipeMongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RecipeMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeMongoApplication.class, args);
	}
    
	@GetMapping(value="/test")
	public String getBooks() {
		return "test Works";
	}

}
