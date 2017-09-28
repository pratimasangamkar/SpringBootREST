package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/first")
	public String getMessage(){
		return "Message from getMessage";
	}
	
	@RequestMapping("/second")
	public String getMessage2(){
		return "Message from getMessage2";
	}
	
	@RequestMapping("/third")
	public String getMessage3(){
		return "Message from getMessage3";
	}
}
