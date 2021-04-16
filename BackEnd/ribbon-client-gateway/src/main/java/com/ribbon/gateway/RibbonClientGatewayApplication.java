package com.ribbon.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableDiscoveryClient
@SpringBootApplication
@RibbonClient(name = "camunda", configuration = RibbonConfiguration.class)
public class RibbonClientGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonClientGatewayApplication.class, args);
	}

}
