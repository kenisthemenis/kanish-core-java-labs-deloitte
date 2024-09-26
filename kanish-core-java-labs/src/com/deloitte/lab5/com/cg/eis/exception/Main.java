package com.deloitte.lab5.com.cg.eis.exception;


public class Main {
	public static void main(String[] args) {
        try {
            Employee employee = new Employee("salman", 2500);
            employee.validateSalary();
            System.out.println("Employee Name: " + employee.getName() + ", Salary: " + employee.getSalary());
        } catch (EmployeeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
