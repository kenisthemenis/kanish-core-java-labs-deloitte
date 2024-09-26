package com.deloitte.lab6;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex6 {
	public static List<Integer> votersList(Map<Integer, LocalDate> peopleMap) {
		List<Integer> eligibleVoterIds = new ArrayList<>();

		for (Map.Entry<Integer, LocalDate> entry : peopleMap.entrySet()) {
			int id = entry.getKey();
			LocalDate dob = entry.getValue();
			int age = calculateAge(dob);

			if (age > 18) {
				eligibleVoterIds.add(id);
			}
		}

		return eligibleVoterIds;
	}

	public static int calculateAge(LocalDate dob) {
		LocalDate today = LocalDate.now();
		return Period.between(dob, today).getYears();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Integer, LocalDate> people = new HashMap<>();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		System.out.println("Enter the number of people:");
		int numberOfPeople = scanner.nextInt();
		scanner.nextLine(); 

		for (int i = 0; i < numberOfPeople; i++) {
			System.out.print("Enter ID for person " + (i + 1) + ": ");
			int id = scanner.nextInt();
			scanner.nextLine(); 

			System.out.print("Enter DOB for person " + id + " (dd-MM-yyyy): ");
			String dobInput = scanner.nextLine();
			LocalDate dob = LocalDate.parse(dobInput, formatter); 

			people.put(id, dob); 
		}

		List<Integer> eligibleVoters = votersList(people);
		System.out.println("Eligible voter IDs: " + eligibleVoters);

		scanner.close();
	}
}
