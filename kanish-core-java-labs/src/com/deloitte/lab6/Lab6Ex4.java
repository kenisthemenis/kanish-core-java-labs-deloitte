package com.deloitte.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex4 {

	public static Map<Long, String> getStudents(HashMap<Long, Integer> marksMap) {
		Map<Long, String> medalsMap = new HashMap<>();

		for (Map.Entry<Long, Integer> entry : marksMap.entrySet()) {
			Long registrationNumber = entry.getKey();
			int marks = entry.getValue();
			String medalType;

			if (marks >= 90) {
				medalType = "Gold";
			} else if (marks >= 80 && marks < 90) {
				medalType = "Silver";
			} else if (marks >= 70 && marks < 80) {
				medalType = "Bronze";
			} else {
				continue;
			}

			medalsMap.put(registrationNumber, medalType);
		}

		return medalsMap;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Long, Integer> studentMarks = new HashMap<>();

		System.out.println("Enter the number of students:");
		int numberOfStudents = scanner.nextInt();

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print("Enter registration number: ");
			long registrationNumber = scanner.nextLong();

			System.out.print("Enter marks: ");
			int marks = scanner.nextInt();

			studentMarks.put(registrationNumber, marks);
		}

		Map<Long, String> eligibleStudents = getStudents(studentMarks);

		System.out.println("Students eligible for medals:");
		for (Map.Entry<Long, String> entry : eligibleStudents.entrySet()) {
			System.out.println("Registration Number: " + entry.getKey() + ", Medal: " + entry.getValue());
		}

		scanner.close();
	}
}
