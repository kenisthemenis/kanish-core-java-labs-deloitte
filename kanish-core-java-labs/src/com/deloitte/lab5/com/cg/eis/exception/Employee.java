package com.deloitte.lab5.com.cg.eis.exception;

public class Employee {
	private String name;
    private double salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void validateSalary() throws EmployeeException {
        if (salary < 3000) {
            throw new EmployeeException("Salary must be at least 3000. Invalid salary: " + salary);
        }
    }
    
    
}
