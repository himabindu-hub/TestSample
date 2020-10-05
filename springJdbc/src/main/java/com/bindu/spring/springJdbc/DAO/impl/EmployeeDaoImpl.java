package com.bindu.spring.springJdbc.DAO.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.bindu.spring.springJdbc.DAO.EmployeeDao;
import com.bindu.spring.springJdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.bindu.spring.springJdbc.employee.dto.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Employee employee) {
		String sql="insert into employee values(?,?,?)";
		int results=jdbcTemplate.update(sql, employee.getId(),employee.getFirstname(),employee.getLastname());
		
		return results;
	}
	
	@Override
	public int update(Employee employee) {
		String sql="update employee set firstname=? ,lastname=?  where id=?";
		int results=jdbcTemplate.update(sql, employee.getFirstname(),employee.getLastname(),employee.getId());
		
		return results;
	}

	
	@Override
	public int delete(int id) {
		String sql="delete from employee where id=?";
		int results = jdbcTemplate.update(sql, id);
		
		return results;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Employee read(int id) {
		String sql="select * from employee where id=?";
		EmployeeRowMapper rowMapper=new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql, rowMapper, id);
		return employee;
		
		
	}

	@Override
	public List<Employee> find() {
		String sql="select * from employee ";
		EmployeeRowMapper rowMapper=new EmployeeRowMapper();
	List<Employee> employee=jdbcTemplate.query(sql, rowMapper);
		return employee;
	}

	

	

}
