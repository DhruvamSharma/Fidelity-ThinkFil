package com.fil.thinkFIL.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String index() {
		System.out.println("hello");
		return "hello";
	}
	
	@RequestMapping("/hello2")
	public String index2() {
		return "hello2";
	}
}
