package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

	
//	private static final Logger log = LoggerFactory.getLogger(DemoLogApplication.class);
	
	private static final Logger log = LoggerFactory.getLogger(MyController.class);
	
	@GetMapping("/")
	public String getMethodName() {
		System.out.println("Welcome!");
		log.info("log-info");
		log.error("log-error");
		log.warn("log-warn");
		return "환영합니다.";
	}
	
}
