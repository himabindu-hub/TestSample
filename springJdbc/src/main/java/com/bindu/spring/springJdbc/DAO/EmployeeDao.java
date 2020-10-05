package com.bindu.spring.springJdbc.DAO;

import java.util.List;

import com.bindu.spring.springJdbc.employee.dto.Employee;

public interface EmployeeDao {
	
	int create(Employee employee);
	int update(Employee employee);
	int delete(int id);
	
	Employee read(int id);
	
	List<Employee> find();

}
