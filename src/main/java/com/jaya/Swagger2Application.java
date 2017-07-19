package com.jaya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(value = SwaggerConfig.class)
public class Swagger2Application {

	public static void main(String[] args) {
		SpringApplication.run(Swagger2Application.class, args);
	}
}
