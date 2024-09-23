package com.deloitte.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex3 {
	
	public static void getSorted(int [] secondArr,int size) {
		for(int i=0;i<size;i++) {
			String original = String.valueOf(secondArr[i]);
			String reversed = new StringBuilder(original).reverse().toString();
			secondArr[i]=Integer.parseInt(reversed);
			
		}
		Arrays.sort(secondArr);
	}
	
	
	public static void main(String[]arr) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int arrSize = scanner.nextInt();
		while(arrSize<1) {
			System.out.print("Enter a valid size of array: ");
			arrSize = scanner.nextInt();
		}
		int [] secondArr = new int[arrSize];
		System.out.println("Enter the numbers of the array: ");
		for(int i=0;i<arrSize;i++){
		
			if(scanner.hasNextInt()) {
				secondArr[i] = scanner.nextInt();
			}
			
		}
		getSorted(secondArr,arrSize);
		for(int i=0;i<arrSize;i++) {
			System.out.print(secondArr[i]+" ");
		}
		
		scanner.close();
	}
	
}
