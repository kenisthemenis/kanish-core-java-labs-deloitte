package com.deloitte.lab1;

import java.util.Scanner;

public class Lab1Ex8 {
	
	public static boolean checkNumber(int n) {
		int counter = 0;
		while(n>0) {
			
			if((n&1)==1) {
				counter++;
				
			}
			if(counter>1) {
				return false;
			}
			n=n>>1;
			
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
			System.out.print("The number is a power of two");

			
		}
		else {
			System.out.print("The number is not a power of two");

			
		}
				
		
		scanner.close();

}
}
