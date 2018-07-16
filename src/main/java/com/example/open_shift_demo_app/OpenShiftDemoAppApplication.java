package com.example.open_shift_demo_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class OpenShiftDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenShiftDemoAppApplication.class, args);
	}
}
