package Exercise4;

import org.junit.Assert;
import org.junit.Test;

public class MyClassTest {
	@Test (expected = IllegalArgumentException.class)
	public void testCheckX() {
		MyClass myclass = new MyClass();
		myclass.multiply(1500, 100); // throw an exception
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCheckY() {
		MyClass myclass = new MyClass();
		myclass.multiply(10, 0); // expect an illegalArgumentException
	}
	
	@Test (timeout = 400)
	public void testCheckXandY() {
		MyClass myclass = new MyClass();
		Assert.assertEquals(6, myclass.multiply(12, 2));
	}
	
	
}
