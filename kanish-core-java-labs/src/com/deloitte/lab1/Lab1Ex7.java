package com.deloitte.lab1;

import java.util.Scanner;

public class Lab1Ex7 {
	
	public static boolean checkNumber(int number) {
		while(number>0) {
			int temp = number%10;
			number = number/10;
			if(number%10>temp) {
				return false;
			}
			
		}
		return true;
		
	}
	public static void main(String[] arr) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a valid number: ");
		int number = scanner.nextInt();
		while(number<0) {
			System.out.print("Enter a valid number: ");
			number = scanner.nextInt();

		}
		if(checkNumber(number)) {
			System.out.print("The number is an increasing number");

			
		}
		else {
			System.out.print("The number is not an increasing number");

			
		}
		
		
		scanner.close();

}}

