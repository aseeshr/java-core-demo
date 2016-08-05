package com.test.client;

import java.util.List;

import com.test.models.Employee;
import com.test.service.EmployeeService;
import com.test.serviceimpl.EmployeeServiceImpl;

public class RunEmployee {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp1 = new Employee();

		emp1.setId(1);
		emp1.setFirstName("Shyam");
		emp1.setLastName("Manandher");
		emp1.setAddress("NewRoad");
		emp1.setPhone("989898");

		emp.setId(2);
		emp.setFirstName("RamJee");
		emp.setLastName("Shrestha");
		emp.setPhone("92199999");
		emp.setAddress("Nepal");

		EmployeeService es = new EmployeeServiceImpl();
		es.addEmployee(emp1);
		es.addEmployee(emp);

		// get all employee
		List<Employee> eList = es.getEmployee();
		for (Employee e : eList) {
			System.out.println("Id =" + e.getId());
			System.out.println("First Name =" + e.getLastName());
			System.out.println("Phone no =" + e.getPhone());
			System.out.println("Address =" + e.getAddress());
			System.out.println("****************");

		}
		// delete Employee
		System.out.println("After Deleted ");
		es.deleteEmployee(1);
		List<Employee> eList1 = es.getEmployee();
		for (Employee e : eList1) {
			System.out.println("Id =" + e.getId());
			System.out.println("First Name =" + e.getLastName());
			System.out.println("Phone no =" + e.getPhone());
			System.out.println("Address =" + e.getAddress());
			System.out.println("****************");

		}
	}
}
