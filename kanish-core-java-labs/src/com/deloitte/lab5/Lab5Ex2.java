package com.deloitte.lab5;

public class Lab5Ex2 {

    public static class nameException extends Exception {
        public nameException(String message) {
            super(message);
        }
    }

    public static class Employee {
        private String firstName;
        private String lastName;

        public Employee(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void validateName() throws nameException {
            if (firstName == null || firstName.trim().isEmpty() || lastName == null || lastName.trim().isEmpty()) {
                throw new nameException("First name or last name cannot be blank.");
            }
        }
    }

    public static void main(String[] args) {
        try {
            Employee employee = new Employee("sanjay", "");
            employee.validateName();
            System.out.println("Employee Name: " + employee.getFirstName() + " " + employee.getLastName());
        } catch (nameException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
