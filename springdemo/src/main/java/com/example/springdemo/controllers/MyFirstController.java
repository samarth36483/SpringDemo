package com.example.springdemo.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.Greeting;

@RestController
public class MyFirstController {
//	private MyFirstService myFirstService;
//	
//	public MyFirstController(MyFirstService myFirstService) {
//		this.myFirstService = myFirstService;
//	}
	
	private static String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World")String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

}
