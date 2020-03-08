package com.springboot2.newfeature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class NewfeatureApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewfeatureApplication.class, args);
	}

}
