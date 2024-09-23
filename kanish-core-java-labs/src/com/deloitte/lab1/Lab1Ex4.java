package com.deloitte.lab1;
import java.util.Scanner;
public class Lab1Ex4 {
	
	
	public static boolean isPrime(int number) {
		for(int i=2;i<Math.sqrt(number);i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] arr) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a valid number: ");
		int number = scanner.nextInt();
		if(number<=1) {
			System.out.print("No prime numbers exists");
		}
		else {
			for(int i=2;i<number;i++ ) {
				if(isPrime(i)) {
					System.out.print(i+" ");
					
				}
			}
			
		
		}
		scanner.close();

}}
