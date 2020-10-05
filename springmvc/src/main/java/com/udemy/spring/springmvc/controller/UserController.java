package com.udemy.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.spring.springmvc.employee.dto.UserReg;

@Controller
public class UserController {
	

	@RequestMapping("showviewpage")
	public ModelAndView showRegistrationPage() {
		
		ModelAndView modelAndView= new ModelAndView();
		
		modelAndView.setViewName("userReg");
		
		return modelAndView;
		
	}
	
	@RequestMapping(value="registerUser", method=RequestMethod.POST)
	public ModelAndView registrationUser(@ModelAttribute("user") UserReg user) {
		
		System.out.println(user);
		ModelAndView modelAndView= new ModelAndView();
		
		modelAndView.addObject("user", user);
		modelAndView.setViewName("reg");
		
		return modelAndView;
		
	}
}
