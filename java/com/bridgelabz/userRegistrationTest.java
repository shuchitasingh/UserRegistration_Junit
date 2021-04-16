package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class userRegistrationTest {
    boolean check = true;
    boolean checkFalse = false;
    private Assertions Assert;

    /**
     * @method testValidateFirstName test Happy case for first name
     * @Test take a correct input where first latter is Cap
     * @return true
     */
    @Test
    public void testValidateFirstName() {
        userRegistration userValidator = new userRegistration();
        boolean result = userValidator.isValidFirstName("Shuchita");
        Assert.assertEquals(check, result);
    }

    /**
     * @method testValidateLastName test Happy case for Last name
     * @Test take a correct input
     * @return true
     */
    @Test
    public void testValidateLastName() {
        userRegistration userValidator = new userRegistration();
        boolean result = userValidator.isValidLastName("Singh");
        Assert.assertEquals(check, result);
    }
    /**
     * @method testValidateLastName test Happy case for email
     * @Test take a correct input
     * @return true
     */

    @Test
    public void testValidateEmail() {
        userRegistration userValidator = new userRegistration();
        boolean result = userValidator.isValidEmail("xyz.@km.com");
        Assert.assertEquals(check, result);
    }

    /**
     * @method testValidateLastName test Happy case for mobile number
     * @Test take a correct input
     * @return true
     */
    @Test
    public void testValidateMobileNumber() {
        userRegistration userValidator = new userRegistration();
        boolean result = userValidator.isValidMobileNumber("+91 9096795337");
        Assert.assertEquals(check, result);
    }

    /**
     * @method testValidateLastName test Happy case for password
     * @Test take a correct input
     * @return true
     */
    @Test
    public void testValidatePassword() {
        userRegistration userValidator = new userRegistration();
        boolean result = userValidator.isValidPassword("suchi_12@");
        Assert.assertEquals(check, result);
    }

    private void Password(String s) {
    }


    /**
     * @method testValidateFirstName test Sad case for first name
     * @Test take a correct input where first latter is Cap
     * @return true
     */
    @Test
    public void testNotValidateFirstName() {
        userRegistration userValidator = new userRegistration();
        boolean result = userValidator.isValidFirstName("shuchita");
        Assert.assertEquals(checkFalse, result);
    }

    /**
     * @method testValidateLastName test sad case for Last name
     * @Test take a correct input
     * @return true
     */
    @Test
    public void testNotValidateLastName() {
        userRegistration userValidator = new userRegistration();
        boolean result = userValidator.isValidLastName("singh");
        Assert.assertEquals(checkFalse, result);
    }
    /**
     * @method testValidateLastName test sad case for email
     * @Test take a correct input
     * @return true
     */

    @Test
    public void testNotValidateEmail() {
        userRegistration userValidator = new userRegistration();
        boolean result = userValidator.isValidEmail("xyz.@km.com");
        Assert.assertEquals(checkFalse, result);
    }

    /**
     * @method testValidateLastName test sad case for mobile number
     * @Test take a correct input
     * @return true
     */
    @Test
    public void testNotValidateMobileNumber() {
        userRegistration userValidator = new userRegistration();
        boolean result = userValidator.isValidMobileNumber("9096795337");
        Assert.assertEquals(checkFalse, result);
    }

    /**
     * @method testValidateLastName test sad case for password
     * @Test take a correct input
     * @return true
     */
    @Test
    public void testNotValidatePassword() {
        userRegistration userValidator = new userRegistration();
        boolean result = userValidator.isValidPassword("suchi_12@");
        Assert.assertEquals(checkFalse, result);
    }
}
