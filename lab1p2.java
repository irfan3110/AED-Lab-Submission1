package edu.neu.mgen; 
import java.util.ArrayList;
import java.util.List;
public class lab1p2 {
    public static void main(String[] args) {
        // Initialize ArrayList of names
        List<String> names = new ArrayList<>();
        names.add("karthik");
        names.add("pual");
        names.add("koti");
        names.add("tom");
        names.add("asif");

        // Switch first and last letters in each name
        List<String> switchedNames = switchFirstAndLastLetters(names);

        // Print original and switched names
        System.out.println("Names = " + names);
        System.out.println("Names (switched) = " + switchedNames);
    }

    // Method to switch first and last letters in a list of names
    private static List<String> switchFirstAndLastLetters(List<String> names) {
        List<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            String switchedName = switchFirstAndLastLetters(name);
            switchedNames.add(switchedName);
        }
        return switchedNames;
    }

    // Method to switch first and last letters of a string
    private static String switchFirstAndLastLetters(String name) {
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);
        String middlePart = name.substring(1, name.length() - 1).toLowerCase();
        return Character.toUpperCase(lastChar) + middlePart + Character.toLowerCase(firstChar);
    }
}