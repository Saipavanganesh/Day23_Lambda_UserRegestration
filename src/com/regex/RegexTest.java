package com.regex;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RegexTest {
    @Test
    public void testFirstName() throws Exception{
        Regex regex = new Regex();
        String firstName = "Sai";
        Assertions.assertEquals("Valid Pattern for " + firstName, regex.firstName(firstName));
    }
    @Test
    public void testLastName() throws Exception{
        Regex regex = new Regex();
        String lastName = "Pavan";
        Assertions.assertEquals("Valid Pattern for " + lastName, regex.lastName(lastName));
    }
    @Test
    public void testMobileNumber() throws Exception{
        Regex regex = new Regex();
        String mobileNumber = "8374218460";
        Assertions.assertEquals("Valid Pattern for " + mobileNumber, regex.mobileNumber(mobileNumber));
    }
    @Test
    public void testEmail() throws Exception{
        Regex regex = new Regex();
        String email = "saipavanganesh@email.com";
        Assertions.assertEquals("Valid Pattern for " + email, regex.email(email));
    }
    @Test
    public void testPassword() throws Exception{
        Regex regex = new Regex();
        String password = "Bridge@123";
        Assertions.assertEquals("Valid Pattern for " + password, regex.password(password));
    }
}