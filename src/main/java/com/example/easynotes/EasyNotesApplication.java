package com.example.easynotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EasyNotesApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(EasyNotesApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(EasyNotesApplication.class, args);
	}
}
