package Exercise3_Fail;

import static org.junit.Assert.fail;

import org.junit.Test;

public class Fail_Example {
	// negative test case for division - divide by zero
		@Test(expected = IllegalArgumentException.class)
		public void testDivisionByZero() {
			Divide_By_Zero.divide(9, 0);
		}

}
