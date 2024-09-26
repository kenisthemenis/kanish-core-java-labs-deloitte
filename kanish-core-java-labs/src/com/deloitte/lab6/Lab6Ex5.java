package com.deloitte.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lab6Ex5 {

	public static int getSecondSmallest(int[] array) {
		List<Integer> list = new ArrayList<>();

		for (int num : array) {
			list.add(num);
		}

		Collections.sort(list);

		return list.get(1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of elements: ");
		int size = scanner.nextInt();

		int[] numbers = new int[size];

		System.out.println("Enter " + size + " integers:");
		for (int i = 0; i < size; i++) {
			numbers[i] = scanner.nextInt(); 
		}

		int secondSmallest = getSecondSmallest(numbers);
		System.out.println("The second smallest element is: " + secondSmallest);

		scanner.close();
	}
}
