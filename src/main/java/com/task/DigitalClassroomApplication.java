package com.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DigitalClassroomApplication {

//	Logger logger = new Logger();
	public static void main(String[] args) {
//		logger.info("started");
		SpringApplication.run(DigitalClassroomApplication.class, args);
	}

}
