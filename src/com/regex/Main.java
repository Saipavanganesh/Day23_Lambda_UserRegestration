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
        System.out.println(regex.firstName(firstName));

        System.out.println("Enter last name");
        String lastName = sc.next();
        System.out.println(regex.lastName(lastName));

        System.out.println("Enter Mobile Number");
        String mobileNumber = sc.next();
        System.out.println(regex.mobileNumber(mobileNumber));

        System.out.println("Enter email");
        String email = sc.next();
        System.out.println(regex.email(email));

        System.out.println("Enter Password");
        String password = sc.next();
        System.out.println(regex.password(password));

        System.out.println("Checking different email patterns");
        emailsFromFile();
    }
    public static void emailsFromFile() throws FileNotFoundException {
        Regex regex1 = new Regex();
        File file = new File("D:\\JavaProgramsBridgelabz\\Regex\\src\\com\\regex\\emails.txt");
        Scanner fileScanner = new Scanner (file);
        while(fileScanner.hasNextLine()){
            String line =fileScanner.nextLine();
            boolean emailPattern = Pattern.matches("^[A-Za-z0-9]+[.]?[A-Za-z0-9]+[@][a-zA-Z]+[.][a-zA-Z]+[.]?[a-zA-Z]{2}$", line);
            System.out.println(regex1.checkPattern(line, emailPattern));
        }
    }
}
