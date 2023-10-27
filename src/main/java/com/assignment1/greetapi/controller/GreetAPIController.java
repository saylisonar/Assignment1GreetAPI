package com.assignment1.greetapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// TODO: Auto-generated Javadoc
/**
 * The Class GreetAPIController.
 */
@RestController
@RequestMapping("/greetapi/v1")
public class GreetAPIController {
	
	/**
	 * Greet API.
	 *
	 * @return the string
	 */
	@GetMapping("/hello")
	public String greetAPI(){
		return "Hello World!!";
	}
	
	/**
	 * Greet API with name.
	 *
	 * @param name the name
	 * @return the string
	 */
	@GetMapping("/hellonm")
	public String greetAPIWithName(@RequestParam(name = "name") String name) {
		return "Hello "+name+"!!";
	}
}
