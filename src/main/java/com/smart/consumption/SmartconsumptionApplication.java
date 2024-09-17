package com.smart.consumption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.smart.consumption.query", "com.smart.consumption.command"})
public class SmartconsumptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartconsumptionApplication.class, args);
	}

}
