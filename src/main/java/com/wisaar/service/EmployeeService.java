package com.wisaar.service;

import java.util.List;

import com.wisaar.model.Employee;

public interface EmployeeService {
	Employee getEmployeeById(long id);
	List<Employee> getAllEmployees();
}
