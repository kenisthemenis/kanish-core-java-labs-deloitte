package com.deloitte.lab9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Lab9Ex3 {

    public static Map<String, String> createMap() {
        Map<String, String> credentials = new HashMap<>();
        credentials.put("user123", "P@ssw0rd123");
        credentials.put("admin", "Adm1n#2024");
        credentials.put("guest", "Gue$tP@ss");
        credentials.put("alice", "Alic3$h0w!");
        credentials.put("bob", "B0b&Secure#99");
        credentials.put("charlie", "Ch@rl!e2023");
        credentials.put("dave", "D@ve2024$!");
        credentials.put("eve", "Eve*2023*");
        credentials.put("frank", "Frank!$123");
        credentials.put("grace", "Gr@ce123!");
        return credentials;
    }

    public static void main(String[] args) {
        Map<String, String> credentials = createMap();

        BiFunction<String, String, Boolean> authenticate = (username, password) -> {
            return credentials.containsKey(username) && credentials.get(username).equals(password);
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String inputUsername = scanner.nextLine();
        System.out.println("Enter your password: ");
        String inputPassword = scanner.nextLine();
        scanner.close();

        boolean isAuthenticated = authenticate.apply(inputUsername, inputPassword);
        if(isAuthenticated) {
            System.out.println("Authentication successful ");

        }
        else {
            System.out.println("Authentication failed ");

        }
    }
}
