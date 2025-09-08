package Exercise3_Fail;

import static org.junit.Assert.fail;

public class Divide_By_Zero {
	
	static public int divide(int a, int b) {
		
		// error handling for division by zero input
		if(b == 0) {
			fail("Cannot divide by zero.");
		}
		return a / b;
	}

}