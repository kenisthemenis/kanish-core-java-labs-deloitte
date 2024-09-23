
package com.deloitte.lab1;
import java.util.Scanner;
public class Lab1Ex1 {
	
	public static void main(String[]arr) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: "); 
		int inputNumber = scanner.nextInt();
		int number = inputNumber;
		int numberSum = 0;
		while(number>0) {
			int currentNumber = number%10;
			numberSum+=(currentNumber*currentNumber*currentNumber);
			number = number/10;		
		}
		System.out.println("The sum of cubes of the digits of the entered number is: " + numberSum);
		scanner.close();
		
	}

}
