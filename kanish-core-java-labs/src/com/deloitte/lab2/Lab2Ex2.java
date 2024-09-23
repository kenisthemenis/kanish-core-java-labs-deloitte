package com.deloitte.lab2;
import java.util.Arrays;
import java.util.Scanner;


public class Lab2Ex2 {
	
	public static void sortStrings(String[] arr,int size) {
		Arrays.sort(arr);
		int loopTermination = 0;
		if(size%2==0) {
			loopTermination = size/2;
		}
		else {
			loopTermination = (size+1)/2;
		}
		for(int i =0;i<loopTermination;i++) {
			arr[i] = arr[i].toUpperCase();
		}
		
	}
	public static void main(String[] arr) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int arrSize = scanner.nextInt();
		while(arrSize<1) {
			System.out.print("Enter a valid size of array: ");
			arrSize = scanner.nextInt();
		}
		String [] secondArr = new String[arrSize];
		System.out.println("Enter the String inputs of the array: ");
		for(int i=0;i<arrSize;i++){
		
				secondArr[i] = scanner.next();
			
		}
		sortStrings(secondArr,arrSize);
		for(int i=0;i<arrSize;i++) {
			System.out.println(secondArr[i]);
		}
		scanner.close();
}}
