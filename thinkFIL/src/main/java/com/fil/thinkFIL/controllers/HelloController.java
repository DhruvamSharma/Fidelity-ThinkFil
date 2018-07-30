package com.fil.thinkFIL.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String index() {
		System.out.println("hello");
		return "hello";
	}
	
	@RequestMapping("/hello2")
	public String index2() {
		System.out.println("hello2");
		return "hello2";
	}
}
