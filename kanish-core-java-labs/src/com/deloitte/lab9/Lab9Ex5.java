package com.deloitte.lab9;

import java.util.Scanner;
import java.util.function.Function;

public class Lab9Ex5 {

	public static long factorial(int number) {
		if (number == 0 || number == 1) {
			return 1;
		}
		long result = 1;
		for (int i = 2; i <= number; i++) {
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		Function<Integer, Long> factorialFunction = Lab9Ex5::factorial;
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the number: ");
		int number = scanner.nextInt();
		long result = factorialFunction.apply(number);
		System.out.println("Factorial of " + number + " is: " + result);

		scanner.close();

	}
}
