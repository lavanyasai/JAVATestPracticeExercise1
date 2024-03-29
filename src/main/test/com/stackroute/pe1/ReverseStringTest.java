package com.stackroute.pe1;

import com.stackroute.pe1.ReverseString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString reverseString;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        reverseString = new ReverseString();
    }

    @Test
    public void givenStringlondonReturnsReversedStringnodnol() {
        expectedResult = reverseString.reverseString("london");
        actualResult = "nodnol";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenStringstackReturnsReversedStringkcats() {
        expectedResult = reverseString.reverseString("stack");
        actualResult = "kcats";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        reverseString = null;
    }
}