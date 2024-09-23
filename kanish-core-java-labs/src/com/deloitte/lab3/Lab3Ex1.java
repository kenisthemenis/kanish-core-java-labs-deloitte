package com.deloitte.lab3;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Lab3Ex1 {



	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter integers separated by spaces: ");
	        String input = scanner.nextLine();
	        
	        StringTokenizer st1 = new StringTokenizer(input, " ");
	        
	        int sum = 0;
	        while(st1.hasMoreTokens()) {
	        	String st2 = st1.nextToken();

	        	if(st1.countTokens()==0) {
		        	System.out.print(st2);

	        	}
	        	else {
		        	System.out.print(st2+" + ");

	        	}
	        	sum+=Integer.parseInt(st2);

	        	
	        }
	        System.out.print(" = "+sum);
	        
	        scanner.close();
	        }
}
