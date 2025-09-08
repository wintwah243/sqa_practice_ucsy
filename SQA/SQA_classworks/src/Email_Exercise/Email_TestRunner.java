package Email_Exercise;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class Email_TestRunner {
	public String email;
	public boolean m;
	
	public Email_TestRunner(String email, boolean m) {
		// constructor
		this.email = email;
		this.m = m;
	}
	
	@Parameters
	public static Collection<Object[]> checkEmailData(){
		return Arrays.asList(new Object [][] {
			{"mary@testdomain.com", true},
			{"mary.smith@testdomain.com", true},
			{"mary_smith123@testdomain.com", true},
			{"mary@testdomaindotcom", false},
			{"mary-smith@testdomain", false},
			{"testdomain.com", false}
		});
	}
	
	@Test
	public void EmailTest() {
		assertTrue("Email valid test", m == EmailIdUtility.isValid(email));
		System.out.println("Answer: "+ EmailIdUtility.isValid(email) + " When Expected " + m);
	}
}
