package com.commarce.commarce;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication(
		scanBasePackages = {"com.commarce.commarce", "util"})
	public class CommarceApplication {

	static void main(String[] args) {
		SpringApplication.run(CommarceApplication.class, args);
	}

	// This is Custom Code
	@Bean
	public CommandLineRunner commandLineRunner() {
		return ignoredArgs -> System.out.println("Hello, World!");
	}

}
