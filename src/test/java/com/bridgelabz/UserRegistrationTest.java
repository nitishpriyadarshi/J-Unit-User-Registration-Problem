package com.bridgelabz;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserRegistrationTest {
    @Test
    public void testFirstName() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.firstName("Nitish"));
        Assertions.assertFalse(UserRegistration.firstName("adarshi"));
    }
}
