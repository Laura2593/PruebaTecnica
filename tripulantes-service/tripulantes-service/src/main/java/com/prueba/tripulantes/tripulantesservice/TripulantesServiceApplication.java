package com.prueba.tripulantes.tripulantesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients
@ComponentScan({"com.prueba.tripulantes.tripulantesservice.repository"})
public class TripulantesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripulantesServiceApplication.class, args);
	}

}
