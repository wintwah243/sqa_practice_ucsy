package CalcTestCase_Exercise1;

import org.junit.*;
import static org.junit.Assert.*;

public class CalcTestCase {
	
	// test cases for addition
	@Test
	public void testAdd() {
		// positive test cases for addition
		assertEquals("Addition should work by getting 5.", 5, Calc.add(2,3));
		assertEquals("Addition should work by getting -3.", -3, Calc.add(-1, -2));
	}
	
	// test cases for subtraction
	@Test
	public void testSubtract() {
		// positive test cases for subtraction
		assertEquals("Subtractions should work by getting 2.", 2, Calc.subtract(5, 3));
		assertEquals("Subtractions should work by getting -2.", -2, Calc.subtract(3, 5));
	}
	
	// test cases for multiplication
	@Test
	public void testMultiply() {
		// positive test cases for multiplication
		assertEquals("Multiplication should work by getting 8.", 8, Calc.multiply(4, 2));
		assertEquals("Multiplication should work by getting -6", -6, Calc.multiply(2, -3));
        assertEquals("Multiplication should wrok by getting 0", 0, Calc.multiply(0, 5));
	}
	
	// test cases for division
	@Test
	public void testDivision() {
		// positive test cases for division
		assertEquals("Division should work by getting 2.", 2, Calc.divide(6, 3));
		assertEquals("Division should work by getting -2.", -2, Calc.divide(6, -3));
		
	}
	
	// negative test case for division - divide by zero
	@Test(expected = IllegalArgumentException.class)
	public void testDivisionByZero() {
		Calc.divide(9, 0);
	}

}
