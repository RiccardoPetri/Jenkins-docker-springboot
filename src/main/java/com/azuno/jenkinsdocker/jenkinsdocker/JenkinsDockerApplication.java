package com.azuno.jenkinsdocker.jenkinsdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDockerApplication.class, args);
	}

	@GetMapping
	public String message() {
		return "Jenkins Docker integration";
	}
}
