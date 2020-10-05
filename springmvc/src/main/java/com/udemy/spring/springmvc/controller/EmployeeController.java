package com.udemy.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.spring.springmvc.employee.dto.Employee;
@Controller
public class EmployeeController {
	
	
	// TO CREATE VIEW AS COLLECTION TYPE

	@RequestMapping("/employee")
	public ModelAndView employeeList() {
		ModelAndView modelAndView=new ModelAndView();
		
		// view name must be same as .jsp file name
		modelAndView.setViewName("displayemployeeList");
		
		Employee emp1=new Employee();
		emp1.setId(1);
		emp1.setName("john");
		emp1.setSalary(200000);
		
		Employee emp2=new Employee();
		emp2.setId(2);
		emp2.setName("bindu");
		emp2.setSalary(250000);
		
		Employee emp3=new Employee();
		emp3.setId(3);
		emp3.setName("Bharath");
		emp3.setSalary(50000);
		
		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		modelAndView.addObject("employees", employees);
		
		return modelAndView;
		
	} 
	
	/* TO CREATE VIEW AS OBJECT TYPE
	//to search with after / name like below /employee
	@RequestMapping("/employee")
	public ModelAndView employeeObject() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("displayemployee");
		
		Employee emp=new Employee();
		emp.setId(1234);
		emp.setName("john");
		emp.setSalary(200000);
		
		modelAndView.addObject("emp", emp);
		
		return modelAndView;
		
	} */

}
