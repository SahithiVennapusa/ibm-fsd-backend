package com.examples.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.examples.spring.dao.EmployeeDao;
import com.examples.spring.model.Employee;
import com.examples.spring.service.EmployeeService;

@Configuration
public class EmployeeConfig {
	
	@Bean
	@Lazy
	public Employee employee()
	{
		Employee emp =new Employee();
		return emp;
	}
	@Bean
	@Lazy
	public EmployeeDao empdao()
	{
		EmployeeDao empd =new EmployeeDao();
		return empd;
	}
	@Bean
	@Lazy
	public EmployeeService empserv()
	{
		EmployeeService emps =new EmployeeService(empdao());
		return emps;
	}

}