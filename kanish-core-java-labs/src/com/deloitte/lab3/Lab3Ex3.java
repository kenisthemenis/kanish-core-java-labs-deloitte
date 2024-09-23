package com.deloitte.lab3;
import java.util.Scanner;

public class Lab3Ex3 {
	
	
	public static String alterString(String str) {
		int size = str.length();
		String result = "";
		for(int i=0;i<size;i++) {
			char tempChar = str.charAt(i);
			if(tempChar =='a' || tempChar =='e' || tempChar =='i' || tempChar=='o' || tempChar=='u') {
				result+=tempChar;
			}
			else {
				if(tempChar=='z') {
					result+='a';
				}
				else {
					tempChar=(char)(tempChar+1);
					result+=tempChar;
					
				}
			}
		}
		return result;
	}
	public static void main(String[]arr) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
		System.out.println(alterString(scanner.nextLine().toLowerCase()));
		scanner.close();
	}

}
