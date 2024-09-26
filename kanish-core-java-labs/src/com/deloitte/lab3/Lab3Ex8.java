package com.deloitte.lab3;

import java.util.Scanner;

public class Lab3Ex8 {
	 public static boolean isPositiveString(String str) {
	        if (str.isEmpty()) {
	            return false;
	        }
	        int size = str.length()	;
	        for (int i = 1; i < size; i++) {
	            char currentChar = str.charAt(i);
	            char previousChar = str.charAt(i - 1);
	            if (currentChar <= previousChar) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
	 public static void main(String[]arr) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = scanner.nextLine();
	        if(isPositiveString(str.toLowerCase())) {
	        	System.out.println("The string is a positive string");
	        }
	        else {
	        	System.out.println("The string is a not positive string");

	        }
	        scanner.close();
	 }
}
