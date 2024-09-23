package com.deloitte.lab1;
import java.util.Scanner;
public class Lab1Ex5 {
	
	
	public static int calculateSum(int n) {
		int result = 0;
		int i=1;
		int p =1;
		int totalCount = 0;
		while(n>totalCount){
			while(3*p<5*i &&totalCount<n) {
				result+=3*p;
				p++;
				totalCount++;
			}
			if(5*i%15!=0 &&totalCount<n) {
				result+=5*i;
				totalCount++;
			}
			i++;
			
		}
		return result;
	}
	public static void main(String[]arr) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a valid number: ");
		int number = scanner.nextInt();
		while(number<0) {
			System.out.print("Enter a valid number: ");
		    number = scanner.nextInt();
		}
		
		System.out.println(calculateSum(number));
		scanner.close();
		}

}
