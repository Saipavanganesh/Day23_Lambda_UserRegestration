package com.regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Regex regex = new Regex();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Name");
        String firstName = sc.next();
        System.out.println(regex.firstName.validate(firstName));

        System.out.println("Enter last name");
        String lastName = sc.next();
        System.out.println(regex.lastName.validate(lastName));

        System.out.println("Enter Mobile Number");
        String mobileNumber = sc.next();
        System.out.println(regex.mobileNumber.validate(mobileNumber));

        System.out.println("Enter email");
        String email = sc.next();
        System.out.println(regex.email.validate(email));

        System.out.println("Enter Password");
        String password = sc.next();
        System.out.println(regex.password.validate(password));
    }
}
