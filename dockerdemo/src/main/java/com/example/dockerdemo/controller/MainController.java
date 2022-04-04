package com.example.dockerdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class MainController {

	@RequestMapping("/user")
	public String greetUser() {
		return "Hello User";
	}
	
	@RequestMapping("/Sir")
	public String greet() {
		return "Hello Sir";
	}
	
	@RequestMapping("/Everyone")
	public String greetEveryone() {
		return "Hello Everyone";
	}
}
