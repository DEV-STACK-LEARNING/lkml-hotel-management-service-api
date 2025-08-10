package com.cpd.hotel_system.lkml_hotel_management_service_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LkmlHotelManagementServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LkmlHotelManagementServiceApiApplication.class, args);
	}

}
