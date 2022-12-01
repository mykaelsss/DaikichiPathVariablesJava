package com.javastack.spring.daikichipathvariables.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("daikichi")
public class DaikichiPathController {
	
	public DaikichiPathController() {
		
	}
	@RequestMapping("/lotto/{number}")
	public String index(@PathVariable("number") Integer number) {
		if(number % 2 == 0) {
			return "You will take a grand journey in the near future, but be wary of tempting offers";
		}
		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
		
	}
	@RequestMapping("/travel/{place}")
	public String travel(@PathVariable("place") String place) {
		return "Congratulations! You will soon travel to " + place;
	}
}
