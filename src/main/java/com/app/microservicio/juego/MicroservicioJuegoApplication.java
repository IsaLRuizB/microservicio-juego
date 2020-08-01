package com.app.microservicio.juego;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.app.commons.alquiler.models.entity"})
@EnableJpaRepositories("com.app.microservicio.juego.models.repository")
public class MicroservicioJuegoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioJuegoApplication.class, args);
	}

}
