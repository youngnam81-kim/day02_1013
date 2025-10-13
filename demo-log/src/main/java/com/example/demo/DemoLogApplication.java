package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoLogApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DemoLogApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoLogApplication.class, args);
	}

    @Bean
    CommandLineRunner run() {
		return args -> {
			
			System.out.println("인포");
			log.info("인포");
			System.out.println("디버그");
			log.debug("디버그");
			System.out.println("error");
			log.error("error");
			System.out.println("WARN");
			log.warn("WARN");
			
		};
		
	}

}
