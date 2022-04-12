package com.ketul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CallPostApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallPostApiApplication.class, args);
	}

	@Bean
	public RestTemplate geTemplate() {
		return new RestTemplate();
	}
}
