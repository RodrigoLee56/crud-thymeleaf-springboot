package com.rodrigolee56.thymeleaf.crud_thymeleaf_springboot.services;

import java.util.List;

import com.rodrigolee56.thymeleaf.crud_thymeleaf_springboot.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();

	void saveEmployee(Employee employee);

	Employee getEmployeeById(Integer id);
}
