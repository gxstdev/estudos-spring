package com.spring.estudos.gerais;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EstudosSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudosSpringApplication.class, args);
	}

}
