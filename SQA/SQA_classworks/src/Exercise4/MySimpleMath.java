package Exercise4;

public class MySimpleMath {
	/**
	* A simple method that takes and input and returns"positive" or "negative" depending on the input number*/
		public String checkSign(int number) {
			if(number >= 0 ) {
				return "positive";
			} else {
				return "negative";
			}
		}
	/**
	* Returns the division of numerator by the denominator. If the denominator is zero, it throws an Exception */
		public double divide(int num, int denom) {
			if(denom == 0) {
				throw new ArithmeticException("Cannot divide by zero");
			} else {
				return num/(double)denom;
			}
		}
		
		public String checkNumDivisibleByTwo(int number) {
			if((number%2) == 0) {
				return "positive";
			}else {
				return "negative";
			}
		}
		
		public int slowSum(int a, int b) {
			try {
				Thread.sleep(500); // 0.5 seconds
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			return a + b;
		}


}
