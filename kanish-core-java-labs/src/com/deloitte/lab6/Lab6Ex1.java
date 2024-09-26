package com.deloitte.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex1 {

	public static List<Integer> getSortedKeys(HashMap<Integer, Integer> map) {
		List<Integer> keysList = new ArrayList<>(map.keySet());
		Collections.sort(keysList);
		return keysList;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<>();

		System.out.println("Enter the number of entries:");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter key (integer):");
			int key = scanner.nextInt();
			System.out.println("Enter value (integer):");
			int value = scanner.nextInt();
			map.put(key, value);
		}

		System.out.println("Key-Value pairs entered:");
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

		List<Integer> sortedKeys = getSortedKeys(map);

		System.out.println("Key-Value pairs sorted by key:");
		for (Integer key : sortedKeys) {
			System.out.println("Key: " + key + ", Value: " + map.get(key));
		}

		scanner.close();
	}
}
