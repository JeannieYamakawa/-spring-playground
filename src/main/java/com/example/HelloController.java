package com.example;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController{
	@GetMapping("/hello")
	public String helloWorld() {
		return "Booyah. Hello World.";
	}


	@PostMapping("/hello")
	public String add(String myString) {
		return "redirect:/hello"
	}
}
