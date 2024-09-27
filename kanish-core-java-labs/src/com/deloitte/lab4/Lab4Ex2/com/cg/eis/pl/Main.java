package com.deloitte.lab4.Lab4Ex2.com.cg.eis.pl;

import java.util.Scanner;

import com.deloitte.lab4.Lab4Ex2.com.cg.eis.bean.Employee;
import com.deloitte.lab4.Lab4Ex2.com.cg.eis.service.EmployeeService;
import com.deloitte.lab4.Lab4Ex2.com.cg.eis.service.EmployeeServiceImpl;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService employeeService = new EmployeeServiceImpl();

		System.out.println("Enter the number of employees:");
		int numEmployees = sc.nextInt();

		for (int i = 0; i < numEmployees; i++) {
			System.out.println("Enter details for Employee " + (i + 1));

			Employee employee = new Employee(0, "", 0.0, "");

			employeeService.getEmployeeDetails(employee);

			employeeService.displayEmployeeDetails(employee);
		}

		sc.close();
	}
}
