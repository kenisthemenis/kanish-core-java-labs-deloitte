package com.deloitte.lab9;

import java.util.Scanner;

@FunctionalInterface
interface MyFunctionalInterface {
    double power(double x, double y);
}

public class Lab9Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base (x): ");
        double x = scanner.nextDouble();

        System.out.print("Enter the power (y): ");
        double y = scanner.nextDouble();

        MyFunctionalInterface powerFunction = (a, b) -> Math.pow(a, b);
        
        double result = powerFunction.power(x, y);
        System.out.println(x + " raised to the power of " + y + " is: " + result);
        
        scanner.close();
    }
}
