package com.deloitte.lab9;

import java.util.function.BiFunction;

public class Lab9Ex4 {
    static class Person {
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
    }

    public static void main(String[] args) {
        BiFunction<String, Integer, Person> personCreator = Person::new;
        Person person = personCreator.apply("CHANDMOHAN", 30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
