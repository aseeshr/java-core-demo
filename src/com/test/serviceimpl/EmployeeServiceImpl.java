package com.test.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.test.models.Employee;
import com.test.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	static List<Employee> emplist = new ArrayList<Employee>();

	@Override
	public void addEmployee(Employee emp) {

		emplist.add(emp);
		System.out.println(emplist.size());
	}

	@Override
	public List<Employee> getEmployee() {

		return emplist;
	}

	@Override
	public void deleteEmployee(int index) {
		emplist.remove(index);
		System.out.println("=====List Size after deleted " + emplist.size());

	}

}
