package com.dkp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountController {

	// private AccountRepository accountRepository ;

	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public String accoutnDetails(ModelMap model) {

		System.out.println(" This is from the Account Controller");

		// Iterable<Account> userDetails = accountRepository.findAll();

		// model.addAttribute("accounts", userDetails);

		return "account";
	}

}
