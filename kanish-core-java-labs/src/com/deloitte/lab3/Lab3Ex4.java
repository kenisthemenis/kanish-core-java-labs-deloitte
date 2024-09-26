package com.deloitte.lab3;
import java.util.Scanner;

public class Lab3Ex4 {
	
	public static int modifyNumber(int num) {
        String str1 = Integer.toString(num); 
        StringBuffer result = new StringBuffer();
        int size = str1.length();

        for (int i = 0; i < size - 1; i++) {
            int firstDigit = Character.getNumericValue(str1.charAt(i));
            int secondDigit = Character.getNumericValue(str1.charAt(i + 1));
            int difference = Math.abs(firstDigit - secondDigit);
            result.append(difference);
        }
        result.append(str1.charAt(size - 1));
        return Integer.parseInt(result.toString());
	}
	public static void main(String[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(modifyNumber(number));
        scanner.close();

	}


}
