package CalcTestCase_Exercise1;

public class Calc {
	
	// for addition (+)
	static public int add(int a, int b) {
		return a + b;
	}
	
	// for subtractiion (-)
	static public int subtract(int a, int b) {
		return a - b;
	}
	
	// for multiplication (*)
	static public int multiply(int a, int b) {
		return a * b;
	}
	
	// for division (/)
	static public int divide(int a, int b) {
		
		// error handling for division by zero input
		if(b == 0) {
			throw new IllegalArgumentException("Cannot divide by zero.");
		}
		return a / b;
	}

}
