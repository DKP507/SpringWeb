package com.dkp.controller;

import javax.servlet.http.HttpServletRequest;

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
	public String sayHelloAgain(HttpServletRequest req,ModelMap model) {
		
		String name =  req.getParameter("name");
		
		String pass = req.getParameter("pass");
		
		if(name.toLowerCase().equals("prasad")&& pass.toLowerCase().equals("admin")) {
			
			model.addAttribute("greetings","YOU are the ADMIN COOL");
			
			return "admin";
			
		}else {

			model.addAttribute("greetings", "Welcome Gerneral AREA");
			
			return "welcome";
		}
		
		
	}
	
}
