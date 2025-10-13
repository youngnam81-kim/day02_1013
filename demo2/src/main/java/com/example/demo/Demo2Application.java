package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

	// http://localhost:8080/hello1?name=홍길동	
	@GetMapping("/hello1")
	public String getMethodName1(@RequestParam("name") String name) {
		System.out.println(name);
		// return String.format("hello111 %s", name);
		return "hello111 "+name;
	}
	
	// http://localhost:8080/hello2?name2=홍길동	
	@GetMapping("/hello2")
	public String getMethodName2(@RequestParam("name2") String name) {
		System.out.println(name);
		return "hello222 "+name;
	}
	
	// http://localhost:8080/hello3?name3=홍길동
	@GetMapping("/hello3")
	public String getMethodName3(@RequestParam(value = "name3") String name) {
		System.out.println(name);
		return "hello333 "+name;
	}
	
	// http://localhost:8080/hello4
	// http://localhost:8080/hello4?name4=홍길동
	@GetMapping("/hello4")
	public String getMethodName4(@RequestParam(value = "name4", defaultValue = "World") String name) {
		System.out.println(name);
		return "hello444 "+name;
	}
	
}
