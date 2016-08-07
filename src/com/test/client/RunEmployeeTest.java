package com.test.client;

import java.util.Scanner;

import com.test.models.Employee;
import com.test.service.EmployeeService;
import com.test.serviceimpl.EmployeeServiceImpl;

public class RunEmployeeTest {
	static int operation, count;

	public static void main(String[] args) {
		EmployeeService es = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please hit 1 for entering employee info and 2 for deleting emplyee info ");
		operation = sc.nextInt();

		switch (operation) {
		case 1:
			empInfo();

			break;
		case 2:
			delete();
		default:
			break;
		}

	}

	private static void delete() {
		EmployeeService es = new EmployeeServiceImpl();
		es.deleteEmployee(0);

	}

	private static void empInfo() {
		Scanner empCount = new Scanner(System.in);
		System.out.println("Please enter the Number of employeee =");
		count = empCount.nextInt();
		Employee[] arEmp = new Employee[count];
		for (int i = 0; i < count; i++) {
			Employee emp1 = new Employee();
			Scanner sc = new Scanner(System.in);

			System.out.print("Please enter Id :");
			emp1.setId(sc.nextInt());

			System.out.print("Please enter Name First :");
			emp1.setFirstName(sc.next());

			System.out.print("Please enter Last Name :");
			emp1.setLastName(sc.next());

			System.out.print("Please enter Phone No. :");
			emp1.setPhone(sc.next());

			System.out.print("Please enter Address :");
			emp1.setAddress(sc.next());
			arEmp[i] = emp1;
			EmployeeService es = new EmployeeServiceImpl();
			es.addEmployee(arEmp[i]);

		}

	}

}
