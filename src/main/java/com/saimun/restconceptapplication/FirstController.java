package com.saimun.restconceptapplication;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from first controller";
	}


	@GetMapping("/hello-another")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public String sayHelloAnother() {
		return "Another Hello from first controller";
	}
}
