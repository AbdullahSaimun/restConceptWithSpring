package com.saimun.restconceptapplication;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

	@PostMapping("/posts")
	public String uploadPost(@RequestBody String data) {
		return "Post is " + data;
	}
	@PostMapping("/orders")
	public String uploadPost(@RequestBody Order order) {
		return "order is " + order;
	}

	@PostMapping("/orders-records")
	public String uploadPostRecords(@RequestBody OrderRecord order) {
		return "order is record" + order;
	}
}
