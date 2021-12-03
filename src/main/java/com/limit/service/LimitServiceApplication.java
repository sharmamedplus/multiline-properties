package com.limit.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LimitServiceApplication {

	@Value("${client.store}")
	public String value;
	
	@Value("${client.store2}")
	public String value2; 
	
	@Value("${client.store3}")
	public String value3;
	
	@Value("${client.store4}")
	public String value4;
	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(LimitServiceApplication.class, args);
	}

	@GetMapping("/hi")
	public String props() {
		System.out.println(value);
		System.out.println("===============================================================");
		System.out.println(value2);
		System.out.println("===============================================================");
		System.out.println(value.equalsIgnoreCase(value2));
		System.out.println(value3==value4);
		return "HI";
	}
}
