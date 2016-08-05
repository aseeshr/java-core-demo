package com.test.service;

import java.util.List;

import com.test.models.Employee;

public interface EmployeeService {
	public void addEmployee(Employee emp);

	public List<Employee> getEmployee();

	public void deleteEmployee(int index);

}
