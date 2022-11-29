package com.pak;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {
	 private static final Logger logger = LoggerFactory.getLogger(SpringBootDockerApplication.class);
	  
	@GetMapping("/docker")
	public String getMessage() {
		logger.info("SpringBootDockerApplication.getMessage called..!!!");
		return "Welcome to Docker..!!";
	}

	public static void main(String[] args) {
		logger.info("Start called..!!");
		SpringApplication.run(SpringBootDockerApplication.class, args);
		logger.info("End called..!!");
	}

}
