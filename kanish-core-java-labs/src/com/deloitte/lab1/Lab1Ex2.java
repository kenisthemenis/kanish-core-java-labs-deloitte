package com.deloitte.lab1;
import java.util.Scanner;

public class Lab1Ex2 {
	
	public static void main(String[] arr) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a valid value: ");
		int currentTrafficSignal = scanner.nextInt();
		while(currentTrafficSignal!=0 && currentTrafficSignal!=1 && currentTrafficSignal!=2) {
			System.out.print("Enter a valid value: ");
			currentTrafficSignal = scanner.nextInt();
		}
		if(currentTrafficSignal==1) {
			System.out.println("Go");
		}
		else if(currentTrafficSignal==0) {
			System.out.println("Stop");

		}
		else {
			System.out.println("Ready");

		}
		scanner.close();
	}

}
