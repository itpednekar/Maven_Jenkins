package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1")
public class HomeController {
	
	@GetMapping("/home")
	public ResponseEntity<?> helloMethod()
	{
		String str = "<h1>Welcome to maven.. Welcome</h1>";
		return new ResponseEntity<>(str, HttpStatus.OK);
	}

}
