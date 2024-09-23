package com.deloitte.lab2;
import java.util.Arrays;
import java.util.Scanner;


public class Lab2Ex1 {
	
	public static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		
		return arr[2];
	}
	public static void main(String[] arr) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int arrSize = scanner.nextInt();
		while(arrSize<2) {
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
		System.out.println(getSecondSmallest(secondArr));
		scanner.close();
}}
