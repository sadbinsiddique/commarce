package com.commarce.commarce;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {
				"com.commarce.commarce",
				"util"})
public class CommarceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommarceApplication.class, args);
	}

}
