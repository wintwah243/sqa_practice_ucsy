package CalcTestCase_Exercise1;

import org.junit.*;
import static org.junit.Assert.*;

public class CalcTestCase {
	
	@Test // positive test cases for addition 
	public void testAddPositive() {
		assertEquals("Addition should work by getting 5.", 5, Calc.add(2,3));
		assertEquals("Addition should work by getting -3.", -3, Calc.add(-1, -2));
	}
	
	
	@Test // negative test case for addition
	public void testAddNegative() {
		assertNotEquals("Addition should not work.", 5, Calc.add(2, 2));
	}
	
	
	@Test // positive test cases for subtraction 
	public void testSubtractPositive() {
		assertEquals("Subtractions should work by getting 2.", 2, Calc.subtract(5, 3));
		assertEquals("Subtractions should work by getting -2.", -2, Calc.subtract(3, 5));
	}
	
	
	@Test // negative test case for subtraction
	public void testSubtractNegative() {
		assertNotEquals("Subtraction should not work.", 1, Calc.subtract(5, 5));
	}
	
	
	@Test // positive test cases for multiplication 
	public void testMultiplyPositive() {
		assertEquals("Multiplication should work by getting 8.", 8, Calc.multiply(4, 2));
		assertEquals("Multiplication should work by getting -6", -6, Calc.multiply(2, -3));
	}
	
	
	@Test // negative test case for multiplication
	public void testMultiplyNegative() {
		assertNotEquals("Multiplication should not work", 10, Calc.multiply(3, 3));
	}
	
	
	@Test // positive test cases for division
	public void testDivisionPositive() {
		assertEquals("Division should work by getting 2.", 2, Calc.divide(6, 3));
		assertEquals("Division should work by getting -2.", -2, Calc.divide(6, -3));
		
	}
	
	// negative test case for division - divide by zero
	@Test(expected = IllegalArgumentException.class)
	public void testDivisionByZero() {
		Calc.divide(9, 0);
	}

}
