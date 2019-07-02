package com.stackroute.pe1;

import com.stackroute.pe1.Pattern;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {

    Pattern pattern;
    String actualResult;
    String expectedResult;

    @Before
    public void setUp() throws Exception {
        pattern = new Pattern();
    }

    @Test
    public void givenInputFiveReturnsFiveLinesOfPattern() {
        actualResult = pattern.printPattern(5);
        expectedResult = "122333444455555";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenInputOneReturnsOneLineOfPattern() {
        actualResult = pattern.printPattern(1);
        expectedResult = "1";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenInputZeroReturnsNothing() {
        actualResult = pattern.printPattern(0);
        expectedResult = "";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        pattern = null;
    }
}