package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodbyeCruelWorld {

	@GetMapping
	public String goodbyeCruelWorld() {
		return "Goodbye cruel world";
	}
}
