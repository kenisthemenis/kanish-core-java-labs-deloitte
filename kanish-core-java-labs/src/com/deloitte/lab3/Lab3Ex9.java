package com.deloitte.lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab3Ex9 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the date (yyyy-mm-dd): ");
        String dateInput = inputScanner.nextLine();
        LocalDate enteredDate = LocalDate.parse(dateInput);
        LocalDate today = LocalDate.now();

        Period timeDifference = Period.between(enteredDate, today);

        System.out.println("Duration from the entered date to today: "
                + timeDifference.getYears() + " years, "
                + timeDifference.getMonths() + " months, "
                + timeDifference.getDays() + " days.");

        inputScanner.close();
    }
}

