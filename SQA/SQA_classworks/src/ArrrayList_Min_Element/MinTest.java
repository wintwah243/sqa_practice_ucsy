package ArrrayList_Min_Element;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.*;
import org.junit.*;

public class MinTest {
	private List<String> list;
	// Test fixture
	// Setup - called before every test method.
	@Before
	public void setUp() {
		System.out.println("setUp()");
		list = new ArrayList<String>();
	}
	
	// Test fixture
	// Tear down - called after every test method
	@After
	public void tearDown() {
		System.out.println("tearDown()");
		list = null; // redundant in this example
	}
	
	@Test
	public void testForNullList() {
		System.out.println("Inside testForNullList()");
		list = null;
		try {
			Min.min(list);
		}catch(NullPointerException e) {
			return;
		}
		fail("NullPointerException expected.");
	}
	
	@Test(expected = NullPointerException.class)
	public void testForNullElement() {
		System.out.println("Inside testForNullElement()");
		list.add(null);
		list.add("cat");
		Min.min(list);
	}
	
	@Test(expected = NullPointerException.class)
	public void testForSoloNullElement() {
		System.out.println("Inside testForSoloNullElement()");
		list.add(null);
		Min.min(list);
	}
	
	@Test(expected = ClassCastException.class)
	@SuppressWarnings("unchecked")
	public void testMutuallyIncomparable() {
		System.out.println("Inside testMutuallyIncomparable()");
		List list = new ArrayList();
		list.add("cat");
		list.add("dog");
		list.add(1);
		Min.min(list);
	}
	
	@Test
	public void testSingleElement() {
		System.out.println("inside testSingleElement()");
		list.add("cat");
		Object obj = Min.min(list);
		assertTrue("Single Element list", obj.equals("cat"));
	}
	
	@Test
	public void testDoubleElement() {
		System.out.println("Inside testDoubleElement()");
		list.add("dog");
		list.add("cat");
		Object obj = Min.min(list);
		assertTrue("Double Element List", obj.equals("cat"));
	}

}
