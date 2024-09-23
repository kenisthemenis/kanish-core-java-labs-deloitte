package com.deloitte.lab1;

import java.util.Scanner;


public class Lab1Ex6 {
	public static int calculateDifference(int n) {
		int a= (n*(n+1))/2;
		int b= (n*(n+1)*(2*n+1))/6;
		a = a*a;
		return a-b;
	}
	public static void main(String[] arr) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a valid number: ");
		int number = scanner.nextInt();
		while(number<0) {
			System.out.print("Enter a valid number: ");
			number = scanner.nextInt();

		}
		System.out.print(calculateDifference(number));
		
		
		scanner.close();

}}

