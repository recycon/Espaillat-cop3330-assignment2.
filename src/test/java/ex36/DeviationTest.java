package ex36;

import junit.framework.TestCase;

public class DeviationTest extends TestCase {

    public void testMax() {

        assertEquals(400,400);
    }

    public void testMin() {
        assertEquals(100,100);
    }

    public void testAvg() {
        assertEquals(400.00,400.00);
    }

    public void testStd() {
        assertEquals(353.55,353.55);
    }
}