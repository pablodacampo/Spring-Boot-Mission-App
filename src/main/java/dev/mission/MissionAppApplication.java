package dev.mission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MissionAppApplication {
	
	public static void main(String[] args) {
		
		// Retrieve the Spring context created by Spring Boot
		// The initial Spring configuration class is MissionAppApplication
		ConfigurableApplicationContext context = SpringApplication.run (MissionAppApplication.class, args);

		// Retrieve a bean of Runnable type
		Runnable exec = context.getBean (Runnable.class);

		// execution
		exec.run ();
	}
}
