package com.bindu.spring.springJdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bindu.spring.springJdbc.DAO.EmployeeDao;
import com.bindu.spring.springJdbc.employee.dto.Employee;

public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bindu/spring/springJdbc/employee/test/config.xml");
		
		EmployeeDao dao=(EmployeeDao) context.getBean("employeeDaoImpl");
		
		/*Employee emp=new Employee();
		emp.setId(1);;
		emp.setFirstname("Pavan");
		emp.setLastname("bob");*/
		
		//int result=dao.create(emp);
		//int result=dao.update(emp);
		//int result=dao.delete(1);
		
		//Employee emp=(Employee) dao.read(2);
		List<Employee> result= dao.find();
		
		System.out.println("number of records in emp:" +result);

	}

}
