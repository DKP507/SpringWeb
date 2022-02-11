package com.dkp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class HelloWorldController {
	
	private Log logger =  LogFactory.getLog(getClass());   
	
	@RequestMapping(value ="/welcome", method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		
		logger.info(" sayHello ");
		
		model.addAttribute("greetings", "Welcome to my page");
		
		return "welcome";
	}
	
	@RequestMapping(value ="/setting", method = RequestMethod.GET)
	public String getSettings(ModelMap model) {
		
		logger.info(" Settings Controller ");
		
		String prop = System.getProperties().toString();
		
		model.addAttribute("set", prop);
		
		return "properties";
	}
	
	

	@RequestMapping(value ="/hello", method = RequestMethod.GET)
	public String sayHelloAgain(HttpServletRequest req,ModelMap model) {
		
		String name =  req.getParameter("name") != null ? req.getParameter("name") : "name" ;
		
		String pass = req.getParameter("pass") != null ? req.getParameter("pass") : "pass";
		
		if(name.toLowerCase().equals("prasad")&& pass.toLowerCase().equals("admin")) {
			
			logger.info(" sayHelloAgain - ADMIN ");
			
			model.addAttribute("greetings","YOU are the ADMIN COOL");
			
			return "admin";
			
		}else {
			
			logger.info(" sayHelloAgain -  GENARAL ");

			model.addAttribute("greetings", "Welcome Gerneral AREA");
			
			return "welcome";
		}
		
		
	}
	
}
