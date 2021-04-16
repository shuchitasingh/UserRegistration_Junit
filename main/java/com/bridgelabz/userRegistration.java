package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistration {
    /**
     * @method isValidFirstName Check the pattern for first name
     * this returns true/false based on the firstname test result
     */
    public boolean isValidFirstName(String FirstName) {

        final String myPattern = "^[A-Z]{1}[a-z]{2,10}$";
        /**
         * @param myPattern contain the correct pattern for First name and last name
         */
        Pattern p = Pattern.compile(myPattern);
        if (FirstName == null) {
            return false;
        }
        Matcher m = p.matcher(FirstName);
        return m.matches();
    }

    public boolean isValidLastName(String LastName) {

        /**
         * @param myPattern contain the correct pattern for First name and last name
         */
        final String myPattern = "^[A-Z]{1}[a-z]{2,10}$";
        Pattern p = Pattern.compile(myPattern);
        if (LastName == null) {
            return false;
        }
        Matcher m = p.matcher(LastName);
        return m.matches();
    }

    public boolean isValidEmail(String email) {

        /**
         * @param regex contain the correct pattern for email
         */
        String regex = "^[a-z0-9]{3,}(.[0-9a-z]+)*@[a-z]{2,}.(com|edu)(co.in)*$";
        Pattern p = Pattern.compile(regex);
        if (email == null) {
            return false;
        }
        Matcher m = p.matcher(email);
        return m.matches();
    }

    public boolean isValidMobileNumber(String mobilenumber) {

        /**
         * @param regex contain the correct pattern for mobile number
         */
        String regex = "^\\+[0-9]+\\s[0-9]{10,15}$";
        Pattern p = Pattern.compile(regex);
        if (mobilenumber == null) {
            return false;
        }
        Matcher m = p.matcher(mobilenumber);
        return m.matches();
    }

    public boolean isValidPassword(String password) {

        /**
         * @param regex contain the correct pattern for mobile number
         */
        String regex = "^(?=.*[0-9])"+"(?=.*[@#$%^&+=])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        if (password == null) {
            return false;
        }
        Matcher m = p.matcher(password);
        return m.matches();
    }

}
