package com.regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    static Scanner sc = new Scanner(System.in);
    static String disp;

    ValidateEntry firstName = (firstName) -> {
        boolean firstNamePattern = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstName);
        if(firstNamePattern){
            disp = "Valid Pattern for " + firstName;
        }
        else{
            disp = "Invalid Pattern for " + firstName;
        }
        return disp;
    };
    ValidateEntry lastName = (lastName) -> {
        boolean lastNamePattern = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName);
        if(lastNamePattern){
            disp = "Valid Pattern for " + lastName;
        }
        else{
            disp = "Invalid Pattern for " + lastName;
        }
        return disp;
    };
    ValidateEntry mobileNumber = (mobileNumber) -> {
        boolean mobileNumberPattern = Pattern.matches("^(91[ ])?[7-9]{1}[0-9]{9}$", mobileNumber);
        if(mobileNumberPattern){
            disp = "Valid Pattern for " + mobileNumber;
        }
        else{
            disp = "Invalid Pattern for " + mobileNumber;
        }
        return disp;
    };
    ValidateEntry email = (email) -> {
        boolean emailPattern = Pattern.matches("^[A-Za-z0-9]+[.]?[A-Za-z0-9]+[@][a-zA-Z]+[.][a-zA-Z]+[.]?[a-zA-Z]{2}$", email);
        if(emailPattern){
            disp = "Valid Pattern for " + email;
        }
        else{
            disp = "Invalid Pattern for " + email;
        }
        return disp;
    };
    ValidateEntry password = (password) -> {
        boolean passwordPattern = Pattern.matches("^(?=.*[@#$%^&+=])(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$", password);
        if(passwordPattern){
            disp = "Valid Pattern for " + password;
        }
        else{
            disp = "Invalid Pattern for " + password;
        }
        return disp;
    };
}