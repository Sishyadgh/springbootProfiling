package com.example.springbootProfiling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.AbstractEnvironment;

@SpringBootApplication
public class SpringbootProfilingApplication {

	public static void main(String[] args) {

		// Determine the active profile based on some condition
		String activeProfile = System.getenv("SPRING_ACTIVE_PROFILE");
		if (activeProfile == null) {
			activeProfile = "dev"; // default profile
		}

		// Set the active profile programmatically
		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, activeProfile);

		SpringApplication.run(SpringbootProfilingApplication.class, args);
	}

}
