package LabTest;

import static org.junit.Assert.*;
import org.junit.Test;

public class PasswordValidatorTest {

    private PasswordValidator validator = new PasswordValidator();

    @Test
    public void testValidPassword() {
        assertTrue(validator.isValidPassword("Abcdef1!"));   
        assertTrue(validator.isValidPassword("StrongPass9@"));
    }

    @Test
    public void testTooShortPassword() {
        assertFalse(validator.isValidPassword("Ab1!")); 
    }

    @Test
    public void testMissingUppercase() {
        assertFalse(validator.isValidPassword("abcdef1!")); 
    }

    @Test
    public void testMissingLowercase() {
        assertFalse(validator.isValidPassword("ABCDEF1!")); 
    }

    @Test
    public void testMissingDigit() {
        assertFalse(validator.isValidPassword("Abcdefg!")); 
    }

    @Test
    public void testMissingSpecialCharacter() {
        assertFalse(validator.isValidPassword("Abcdefg1")); 
    }

    @Test
    public void testNullPassword() {
        assertFalse(validator.isValidPassword(null)); 
    }
}
