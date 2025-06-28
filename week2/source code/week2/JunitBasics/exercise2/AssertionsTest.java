package week2.JunitBasics.exercise2;
// (Optional) Package declaration if you're using packages
// package com.example.testing;

import static org.junit.Assert.*;


public class AssertionsTest {

    @org.testng.annotations.Test
    public void testAssertions() {
        // Check if 2 + 3 equals 5
        assertEquals(5, 2 + 3);

        // Check if condition is true
        assertTrue(5 > 3);

        // Check if condition is false
        assertFalse(5 < 3);

        // Check if value is null
        assertNull(null);

        // Check if value is not null
        assertNotNull(new Object());
    }
}
