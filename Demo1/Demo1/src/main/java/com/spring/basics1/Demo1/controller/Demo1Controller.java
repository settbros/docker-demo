package com.spring.basics1.Demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {

	@GetMapping(path="/hello")
	public String hello(){
		return "Hello Demo1";
	}
}
