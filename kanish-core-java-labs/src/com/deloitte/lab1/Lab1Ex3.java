package com.deloitte.lab1;

import java.util.Scanner;

public class Lab1Ex3 {
	
	public static long printFibonacciRecursion(long number,long last,long secondLast) {
		if(number==0) {
			return secondLast;
		}

		
		return printFibonacciRecursion(number-1,last+secondLast,last);
		
		
	}
	
	public static long printFibonacciIterative(long number,long last,long secondLast) {
		while(number!=0) {
			long tempValue = last;
			last+=secondLast;
			secondLast =tempValue;
			number--;
		}
		return secondLast;
	}
	
	public static void main(String[] arr) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Which Fibonacci number do you want to find? ");
		long number = scanner.nextInt();
		while(number<0) {
			System.out.print("Enter a valid numberr: ");
			number = scanner.nextInt();
		}
		long resultRescursive = printFibonacciRecursion(number,1,0);
		long resultIterative = printFibonacciIterative(number,1,0);

		System.out.println("The nth fibonacci number using recursion is: " + resultRescursive);
		System.out.println("The nth fibonacci number using iteration is: " + resultIterative);

		scanner.close();
		
	}

}
