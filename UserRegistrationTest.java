package com.bl.test;

import com.bl.Junit.ValidateUserRegistration;
import org.junit.Assert;
import org.junit.Test;

/**
 *Write JUnit Test to validate the User Entry for First Name, Last Name,
 * Email, Mobile, and Password.
 *
 * @auther : pranav gupta
 */
public class UserRegistrationTest {
    //Test Cases for First Name Validation
    ValidateUserRegistration validator = new ValidateUserRegistration();

    @Test
    public void givenFirstName_WhenProper_ShouldReturn_True() {
        boolean result = validator.validateFirstName("pranav");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturn_False() {
        boolean result = validator.validateFirstName("pr");
        Assert.assertFalse(result);
    }

    //Test Cases for Last Name Validation
    @Test
    public void givenLastName_WhenProper_ShouldReturn_True() {
        boolean result = validator.validateLastName("gupta");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturn_False() {
        boolean result = validator.validateLastName("gp");
        Assert.assertFalse(result);
    }

    //Test Cases for Email Id Validation
    @Test
    public void validateEmailAddress_WhenValid_ShouldReturnHappy() {
        ValidateUserRegistration userValidation = new ValidateUserRegistration();
        String expectedValue = "Happy";
        String email = userValidation.validateEmail("pg20@gmail.com");
        Assert.assertEquals(expectedValue, email);
    }

    @Test
    public void validateEmailAddress_WhenNotValid_ShouldReturnSad() {
        ValidateUserRegistration userValidation = new ValidateUserRegistration();
        String expectedValue = "Sad";
        String email = userValidation.validateEmail("abc@gmail.com");
        Assert.assertEquals(expectedValue, email);
    }

    // Test Cases for Mobile Number Validation
    @Test
    public void givenPhoneNo_WhenProper_ShouldReturn_True() {
        boolean result = validator.validateMobileNum("91 1234567890");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhoneNo_WhenNotProper_ShouldReturn_False() {
        boolean result = validator.validateMobileNum("1234567890");
        Assert.assertFalse(result);
    }

    // Test Cases for Password Validation 
    @Test
    public void givenPassword_WhenProper_ShouldReturn_True() {
        boolean result = validator.validatePassword("pranav23&");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturn_False() {
        boolean result = validator.validatePassword("pranav123");
        Assert.assertFalse(result);
    }
}