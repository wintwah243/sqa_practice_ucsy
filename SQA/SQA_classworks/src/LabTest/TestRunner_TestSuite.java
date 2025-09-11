package LabTest;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({CalculationTest.class, PasswordValidator.class, NuclearReactorTest.class})

public class TestRunner_TestSuite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		junit.textui.TestRunner.run(suite());

	}
	
	public static junit.framework.Test suite(){
		return new JUnit4TestAdapter(TestRunner_TestSuite.class);
	}

}
