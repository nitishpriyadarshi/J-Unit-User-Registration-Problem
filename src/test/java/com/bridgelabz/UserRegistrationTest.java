package com.bridgelabz;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserRegistrationTest {
    @Test
    public void testFirstName() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.firstName("Nitish"));
        Assertions.assertFalse(UserRegistration.firstName("nitish"));
    }

    @Test
    void lastName() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.lastName("Priyadarshi"));
        Assertions.assertFalse(UserRegistration.lastName("priyadarshi"));
    }

    @Test
    void email() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.email("nitishpriyadarshi692@gmail.com"));
        Assertions.assertFalse(UserRegistration.email("nitish"));
    }
    @Test
    void phoneNumber() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.phoneNumber("91 7677271993"));
        Assertions.assertFalse(UserRegistration.phoneNumber("916753587548"));
    }
    @Test
    void passwordRule1() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.passwordRule1("A4@561PR"));
        Assertions.assertFalse(UserRegistration.passwordRule1("cdf623R"));
    }
    @Test
    void passwordRule2() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.passwordRule2("cpR#$23Qd"));
        Assertions.assertFalse(UserRegistration.passwordRule2("pqrsh#@5"));
    }
    @Test
    void passwordRule3() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.passwordRule3("gS#4refF"));
        Assertions.assertFalse(UserRegistration.passwordRule3("sssHSa%$"));
    }

    @Test
    void passwordRule4() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.passwordRule4("nItish23@23"));
        Assertions.assertFalse(UserRegistration.passwordRule4("DSAsDSE42"));
    }
    @Test
    void emailIdValidator() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.emailIdValidator("abc.100@abc.com.au"));
        Assertions.assertFalse(UserRegistration.emailIdValidator("abc@gmail.com.aa.au"));
    }
}


