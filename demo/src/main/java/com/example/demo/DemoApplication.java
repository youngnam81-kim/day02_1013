package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello Spring!");
	}
	
	@GetMapping("/helloNo")
	//public String getMethodName(@RequestParam String param) {
	public void getMethodName0() {
		System.out.println("나는 helloNo 메소드야!");
	}
	
	@GetMapping("/helloString")
	//public String getMethodName(@RequestParam String param) {
	public String getMethodName() {
		System.out.println("나는 helloString 메소드야!");
		//return new String("helloString()");
		return "Hello getMethodName()";
	}
	
	

}
