package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        System.out.println("Enter first name");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        boolean pattern = Pattern.matches("[A-Z]{1}[a-z]{2,}$", firstName);
        if(pattern){
            System.out.println("Valid First name");
        }
        else{
            System.out.println("Invalid First Name");
        }
    }
}
