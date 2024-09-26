package com.deloitte.lab6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lab6Ex7 {

	public static int[] getSorted(int[] arr) {
		String[] reversedStrings = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {
			StringBuilder sb = new StringBuilder(String.valueOf(arr[i]));
			reversedStrings[i] = sb.reverse().toString();
		}

		List<Integer> reversedIntegers = new java.util.ArrayList<>();
		for (String str : reversedStrings) {
			reversedIntegers.add(Integer.parseInt(str));
		}

		Collections.sort(reversedIntegers);

		int[] sortedArray = new int[reversedIntegers.size()];
		for (int i = 0; i < reversedIntegers.size(); i++) {
			sortedArray[i] = reversedIntegers.get(i);
		}

		return sortedArray;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of elements in the array:");
		int size = scanner.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter " + size + " integers:");

		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		int[] sortedArray = getSorted(arr);

		System.out.println("Sorted array after reversing the numbers:");
		System.out.println(Arrays.toString(sortedArray));

		scanner.close();
	}
}
