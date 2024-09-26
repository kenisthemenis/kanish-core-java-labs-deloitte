package com.deloitte.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex3 {

    public static Map<Integer, Integer> getSquares(int[] numbers) {
        Map<Integer, Integer> squaresMap = new HashMap<>();

        for (int number : numbers) {
            squaresMap.put(number, number * number); 
        }

        return squaresMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt(); 
        }

        Map<Integer, Integer> result = getSquares(numbers); 

        System.out.println("Number and its square:");
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println("Number: " + entry.getKey() + ", Square: " + entry.getValue());
        }

        scanner.close();
    }
}
