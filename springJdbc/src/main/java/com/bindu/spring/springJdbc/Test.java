package com.bindu.spring.springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bindu/spring/springJdbc/config.xml");

		JdbcTemplate jT = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?)";
		int result = jT.update(sql, 1, "Bindu", "hima");
		System.out.println("number of rows inserted:" + result);
		
	}

}
