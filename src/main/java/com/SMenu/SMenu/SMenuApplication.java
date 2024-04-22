package com.SMenu.SMenu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.SMenu.SMenu.model"})
public class SMenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(SMenuApplication.class, args);
	}
}
