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
}


