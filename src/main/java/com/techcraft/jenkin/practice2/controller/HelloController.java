package com.techcraft.jenkin.practice2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String SayHi() {
		return "Hi welcome to springboot application...";
	}
}
