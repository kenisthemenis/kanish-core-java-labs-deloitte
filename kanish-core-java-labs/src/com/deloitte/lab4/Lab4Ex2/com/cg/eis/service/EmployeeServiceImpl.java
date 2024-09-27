package com.deloitte.lab4.Lab4Ex2.com.cg.eis.service;

import com.deloitte.lab4.Lab4Ex2.com.cg.eis.bean.Employee;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

	private Scanner sc = new Scanner(System.in);

	@Override
	public void getEmployeeDetails(Employee employee) {
		System.out.println("Enter employee ID:");
		employee.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter employee name:");
		employee.setName(sc.nextLine());
		System.out.println("Enter employee salary:");
		employee.setSalary(sc.nextDouble());
		sc.nextLine();
		System.out.println("Enter employee designation:");
		employee.setDesignation(sc.nextLine());

		findInsuranceScheme(employee);
	}

	@Override
	public void findInsuranceScheme(Employee employee) {
		employee.setInsuranceScheme(employee.getInsuranceScheme());
	}

	@Override
	public void displayEmployeeDetails(Employee employee) {
		employee.printDetails();
	}
}
