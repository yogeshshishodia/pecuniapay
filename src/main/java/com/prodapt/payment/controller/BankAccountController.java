package com.prodapt.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.prodapt.payment.Entity.BankAccount;
import com.prodapt.payment.service.AccountService;

@Controller
public class BankAccountController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/roleform")
	public String showRoles(@ModelAttribute("bankAccount") BankAccount bankAccount) {
		return "login";
	}
	
	@PostMapping("/loginfo")
	public ModelAndView saveRole(@ModelAttribute("bankAccount") BankAccount bankAccount) {
		BankAccount rol=accountService.addAccount(bankAccount);
		ModelAndView mv=new ModelAndView();
		mv.addObject("roleData",rol);
		mv.setViewName("login");
		return mv;
		
	}
	
}
