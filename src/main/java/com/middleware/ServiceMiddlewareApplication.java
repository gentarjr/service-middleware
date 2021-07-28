package com.middleware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServiceMiddlewareApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceMiddlewareApplication.class, args);
	}

}
