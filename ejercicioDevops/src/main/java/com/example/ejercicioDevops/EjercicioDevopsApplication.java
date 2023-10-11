package com.example.ejercicioDevops;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioDevopsApplication {

	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(EjercicioDevopsApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "5000"));
        app.run(args);
		
		//SpringApplication.run(EjercicioDevopsApplication.class, args);
	}

}
