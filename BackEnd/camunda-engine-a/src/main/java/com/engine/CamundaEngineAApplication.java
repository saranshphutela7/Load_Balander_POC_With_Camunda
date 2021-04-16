package com.engine;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableProcessApplication
@EnableDiscoveryClient
public class CamundaEngineAApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamundaEngineAApplication.class, args);
	}

}
