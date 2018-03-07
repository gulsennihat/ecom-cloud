package com.turkcell.ecommerce.review.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/review/test")
	public String test() {
		return "Geldim";
	}
}
