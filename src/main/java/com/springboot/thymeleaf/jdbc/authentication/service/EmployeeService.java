package com.springboot.thymeleaf.jdbc.authentication.service;

import java.util.List;

import com.springboot.thymeleaf.jdbc.authentication.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	
	Employee findById(int theId);
	
	void save(Employee theEmployee);
	
	void deleteById(int theId);

	List<Employee> searchBy(String theName);
	
}
