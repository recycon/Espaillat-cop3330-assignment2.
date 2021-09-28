package ex29;

import junit.framework.TestCase;

public class rule72Test extends TestCase {

    public void testRule() {
        String a="1";
        assertEquals(a,"1");
    }

    public void testRuleLoop() {
        testRule();
    }

    public void testMain() {
    }
}