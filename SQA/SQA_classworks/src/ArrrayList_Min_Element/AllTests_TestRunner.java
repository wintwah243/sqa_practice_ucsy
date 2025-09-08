package ArrrayList_Min_Element;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({MinTest.class, MinTest_Exercise.class})

public class AllTests_TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		junit.textui.TestRunner.run(suite());

	}
	
	public static junit.framework.Test suite(){
		return new JUnit4TestAdapter(AllTests_TestRunner.class);
	}

}
