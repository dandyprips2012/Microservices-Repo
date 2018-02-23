package com.example.boot.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SchoolClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolClientApplication.class, args);
	}
}
