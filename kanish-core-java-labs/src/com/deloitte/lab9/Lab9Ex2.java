package com.deloitte.lab9;

import java.util.Scanner;
import java.util.function.Function;

public class Lab9Ex2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String input  = scanner.nextLine();
        scanner.close();
		Function<String, String> formatString = str -> {
			String result = "";
            for (int i = 0; i < str.length(); i++) {
                result += str.charAt(i);
                if (i < str.length() - 1 && str.charAt(i) != ' ') {
                    result += " ";
                }
            }
            return result;
		};

		String result = formatString.apply(input);
		System.out.println("Formatted String: " + result);
	}
}
