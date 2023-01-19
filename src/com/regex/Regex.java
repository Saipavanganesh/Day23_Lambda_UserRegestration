package com.regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    static Scanner sc = new Scanner(System.in);
    public String checkPattern(String input, boolean pattern){
        String disp;
        if(pattern){
            disp = "Valid Pattern for " + input;
        }
        else{
            disp = "Invalid Pattern for " + input;
        }
        return disp;
    }

    public String firstName(String firstName){
        boolean firstNamePattern = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstName);
        return(checkPattern(firstName, firstNamePattern));
    }
    public String lastName(String lastName){
        boolean lastNamePattern = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName);
        return(checkPattern(lastName, lastNamePattern));
    }
    public String mobileNumber(String mobileNumber){
        boolean mobileNumberPattern = Pattern.matches("^(91[ ])?[7-9]{1}[0-9]{9}$", mobileNumber);
        return(checkPattern(mobileNumber, mobileNumberPattern));
    }
    public String email(String email){
        boolean emailPattern = Pattern.matches("^[A-Za-z0-9]+[.]?[A-Za-z0-9]+[@][a-zA-Z]+[.][a-zA-Z]+[.]?[a-zA-Z]{2}$", email);
        return(checkPattern(email, emailPattern));
    }
    public String password(String password){
        boolean passwordPattern = Pattern.matches("^(?=.*[@#$%^&+=])(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$", password);
        return(checkPattern(password, passwordPattern));
    }

}