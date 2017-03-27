package com.auphantum.ems.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories( basePackages = {"com.auphantum"} )
@EntityScan( basePackages = {"com.auphantum"} )
@ComponentScan( basePackages = {"com.auphantum"} )
public class AuphantumEmsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuphantumEmsApiApplication.class, args);
	}
}
