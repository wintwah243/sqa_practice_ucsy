package Exercise4;

public class MyClass {
	public int multiply(int x, int y) {
		if(x > 999) {
			throw new IllegalArgumentException("X should be less than 1000");
		} else if (y == 0) {
			throw new IllegalArgumentException("Y should not be 0");
		}
		return x/y;
	}

}
