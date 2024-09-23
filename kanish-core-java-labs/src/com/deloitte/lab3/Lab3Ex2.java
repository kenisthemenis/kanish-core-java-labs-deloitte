package com.deloitte.lab3;

import java.util.Scanner;

public class Lab3Ex2 {
	
	public static String getImage(String st) {
		int size = st.length();
	
		String reverse="";
		for(int i=size-1;i>=0;i--) {
			reverse+=st.charAt(i);
		}
		
		st=st+" | "+reverse;
		return st;

	}
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        System.out.println(getImage(scanner.nextLine()));
	        scanner.close();
	 }

}
