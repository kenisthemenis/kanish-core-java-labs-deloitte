package com.deloitte.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex2 {

    public static Map<Character, Integer> countChars(char[] arr) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : arr) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        return charCountMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of characters you want to input:");
        int size = scanner.nextInt();
        scanner.nextLine(); 

        char[] charArray = new char[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter character " + (i + 1) + ":");
            charArray[i] = scanner.nextLine().charAt(0); 
        }

        Map<Character, Integer> result = countChars(charArray);

        System.out.println("Character counts:");
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        scanner.close();
    }
}
