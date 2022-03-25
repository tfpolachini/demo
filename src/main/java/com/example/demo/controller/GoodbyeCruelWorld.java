package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodbyeCruelWorld {

	@GetMapping("/love")
	public String goodbyeMyLove() {
		return "Goodbye my love!";
	}
	
	@GetMapping("/world")
	public String goodbyeCruelWorld() {
		return "Goodbye cruel world!";
	}
	
	@GetMapping("/friends")
	public String goodbyeMyFriends() {
		return "Goodbye my friends!";
	}
}
