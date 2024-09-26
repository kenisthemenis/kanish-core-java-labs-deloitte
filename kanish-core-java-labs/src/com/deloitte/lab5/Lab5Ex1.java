package com.deloitte.lab5;

public class Lab5Ex1 {
	
	public static class ageException extends Exception {
	    public ageException(String message) {
	        super(message);
	    }
	}
	
	public static class Person {
	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void validateAge() throws ageException {
	        if (this.age <= 15) {
	            throw new ageException("Age must be greater than 15. Invalid age: " + this.age);
	        }
	    }
	}
	
    public static void main(String[] args) {
        try {
            Person person = new Person("manoj", 10);
            person.validateAge();  
            System.out.println(person.getName() + " is " + person.getAge() + " years old.");
        } catch (ageException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
