package Exercise3_Fail;

import static org.junit.Assert.fail;

import org.junit.Test;

public class Homework_FailExample {

    @Test
    public void testString() {
        String actual = "JUnit is great!";

        try {
            // Fail if the string does not include JUnit
            if (actual.contains("Java")) {
                fail("String does not contain Java");
            }

            // Fail if the string is equal to Hello
            if (actual.equals("Hello")) {
                fail("String should not be equal to Hello");
            }

            // Fail if the string does not start with JUnit
            if (actual.startsWith("Java")) {
                fail("String does not start with Java");
            }

        } catch (Exception e) {
            System.out.println("This is catching the error.");
        }
    }
}
