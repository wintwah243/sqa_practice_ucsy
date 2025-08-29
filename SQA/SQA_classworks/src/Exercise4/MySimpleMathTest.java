package Exercise4;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MySimpleMathTest {
	private static MySimpleMath sm;
	@Test
	public void testCheckSignShouldReturnPositive() {
		MySimpleMath sm = new MySimpleMath();
		Assert.assertEquals("positive", sm.checkSign(5));
		Assert.assertEquals("positive", sm.checkSign(0));
	}
	
	@Test
	public void testCheckSignShouldReturnNegative() {
		MySimpleMath sm = new MySimpleMath();
		Assert.assertEquals("negative", sm.checkSign(-5));
	}
	
	@Test
	public void testDivisionShouldReturnPositiveQuotient() {
		MySimpleMath sm = new MySimpleMath();
		Assert.assertEquals(2.0, sm.divide(10, 5), 0);
		Assert.assertEquals(0.0, sm.divide(0, 5), 0);
	}
	
	@Test
	public void testDivisionShouldReturnNegativeQuotient() {
		MySimpleMath sm = new MySimpleMath();
		Assert.assertEquals(-2.0, sm.divide(10, -5), 0); // pass
		Assert.assertNotEquals("error in div(9/3)", 1, sm.divide(9, 3)); //fail
	}
	
	@Test (expected = ArithmeticException.class)
	public void testDivisionShouldThrowArithmeticException() {
		MySimpleMath sm = new MySimpleMath();
		sm.divide(10, 0); // expect an illegalArgumentException
	}
	
	@Test
	public void testDivisionReal() {
		MySimpleMath sm = new MySimpleMath();
		Assert.assertEquals("error in div(1/3)", 0.333333, sm.divide(1, 3), 1e-6);
		Assert.assertEquals("error in div(1/9)", 0.111111, sm.divide(1, 9), 1e-6);
	}
	
	@Test
	public void testDivisibleByTwo() {
		MySimpleMath sm = new MySimpleMath();
		Assert.assertEquals("positive", sm.checkNumDivisibleByTwo(6));
		Assert.assertEquals("negative", sm.checkNumDivisibleByTwo(5));
	}
	
	@BeforeClass
	public static void tearDownBeforeclass() {
		System.out.println("Before all tests");
		MySimpleMath sm = new MySimpleMath();
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("After all test.");
		sm = null;
	}
	
	@Test (timeout = 400)
	public void testSlowSum() {
		int result = sm.slowSum(5, 7);
		Assert.assertEquals(12, result);
	}

}
