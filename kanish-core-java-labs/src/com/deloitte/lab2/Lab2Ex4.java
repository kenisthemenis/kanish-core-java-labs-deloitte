package com.deloitte.lab2;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Lab2Ex4 {
	
	public static int[] removeDuplicates(int[] arr,int size) {
		Arrays.sort(arr);
		int p=1;

		for(int i=1;i<size;i++) {
			 if (arr[i] != arr[i - 1]) {
	                arr[p] = arr[i];
	                p++;
	            }
		}
		int [] result = new int[p];
		for(int i=0;i<p;i++) {
			result[i] = arr[i];
		}
		 for (int i = 0; i < p / 2; i++) {

	            int temp = result[i];
	            result[i] = result[p- i - 1];
	            result[p - i - 1] = temp;
	        }
		return result;
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
		int [] result = removeDuplicates(secondArr,arrSize);
		int size = result.length;
		for(int i=0;i<size;i++) {
			System.out.print(result[i]+" ");
		}
		scanner.close();
}
}