package com.dio.santanderbootcampfullstack2023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class SantanderBootcampFullstack2023Application {

	public static void main(String[] args) {
		SpringApplication.run(SantanderBootcampFullstack2023Application.class, args);
	}

}
