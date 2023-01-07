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
        
        System.out.println("Enter Mobile Number");
        String mobileNumber = sc.nextLine();
        boolean mobileNumberPattern = Pattern.matches("^(91)[\\s][7-9]{1}[0-9]{9}$", mobileNumber);

        System.out.println("Enter first name");
        String firstName = sc.next();
        boolean firstNamePattern = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstName);

        System.out.println("Enter last name");
        String lastName = sc.next();
        boolean lastNamePattern = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName);

        System.out.println("Enter email");
        String email =sc.next();
        boolean emailPattern = Pattern.matches("^[A-Za-z0-9]+[.]?[A-Za-z0-9]+[@][a-zA-Z]+[.][a-zA-Z]+[.]?[a-zA-Z]{2}$", email);

        checkPattern(firstName, firstNamePattern);
        checkPattern(lastName, lastNamePattern);
        checkPattern(email, emailPattern);
        checkPattern(mobileNumber, mobileNumberPattern);

    }
}
