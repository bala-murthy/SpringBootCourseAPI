package com.io.controllers.entry;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppEntryPoint {
	
	@RequestMapping("/entry")
	public String validateEntryPoint() {
		return "Hi There ! You have just hit the entry point of Spring Boot Web App's REST Controller's Validate method";
	}

}
