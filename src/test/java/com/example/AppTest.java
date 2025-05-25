package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {
    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testApp() {
        assertTrue(true);
    }
    
    public void testAddNumbers() {
        App app = new App();
        assertEquals(8, app.addNumbers(5, 3));
        assertEquals(0, app.addNumbers(-1, 1));
    }
}
