package com.dkp.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(value = Exception.class)
	public String setExceprion(Exception e) {
	
		//model.addAttribute("message", "Somethiong Happend We are looking in to this");
		//model.addAttribute("trace", e.getStackTrace());

		return "error";

	}

}
