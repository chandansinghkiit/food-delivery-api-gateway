package com.ftgo.food_delivery_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FoodDeliveryApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodDeliveryApiGatewayApplication.class, args);
	}

}
