package com.saimun.restconceptapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from first controller";
	}
}
