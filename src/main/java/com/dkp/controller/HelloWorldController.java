package com.dkp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloWorldController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		
		model.addAttribute("greetings", "Welcome to my page");
		
		return "welcome";
	}
	

	@RequestMapping(value ="/hello", method = RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {
		
		model.addAttribute("greetings", "Welcome to my page, this is the secon time greeting");
		
		return "welcome";
	}
	
}
