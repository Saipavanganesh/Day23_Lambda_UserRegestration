package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static void checkPattern(String input, boolean pattern){
        if(pattern){
            System.out.println("Valid Pattern for " + input);
        }
        else{
            System.out.println("Invalid Pattern for " + input);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = sc.next();
        boolean firstNamePattern = Pattern.matches("[A-Z]{1}[a-z]{2,}$", firstName);
        System.out.println("Enter last name");
        String lastName = sc.next();
        boolean lastNamePattern = Pattern.matches("[A-Z]{1}[a-z]{2,}$", lastName);
        checkPattern(firstName, firstNamePattern);
        checkPattern(lastName, lastNamePattern);
    }
}
