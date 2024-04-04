package com.example.MyCICD;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@GetMapping("/poll")
	public String get() {
		return "Thanks for polling , Application is running";
	}

	//feature one
	//feature two
	//feature 3
	//feature 4
	//feature  five
}
