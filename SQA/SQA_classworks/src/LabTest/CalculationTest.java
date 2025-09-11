package LabTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationTest {

    @Test
    public void testFindMax() {
        int[] arr = {1, 2, 8, 4, 5};
        assertEquals(8, Calculation.findMax(arr));
    }

    @Test
    public void testCube() {
        assertEquals(27, Calculation.cube(3));
        assertEquals(0, Calculation.cube(0));
        assertEquals(-8, Calculation.cube(-2));
    }

    @Test
    public void testReverseWord() {
        assertEquals("olleH ", Calculation.reverseWord("Hello"));
        assertEquals("tinuJ ", Calculation.reverseWord("Junit"));
    }
}
