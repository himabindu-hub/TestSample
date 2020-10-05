package com.udemy.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamController {
	@RequestMapping("/showData")
	public ModelAndView showData(@RequestParam("id") int id,
			@RequestParam("name") String name,@RequestParam(value="sal",required=false,defaultValue="0.0") double salary) {
		System.out.println("Id" +id);
		System.out.println("name" +name);
		System.out.println("Salary" +salary);
		
		
		return new ModelAndView("userReg");
		
	}

}
