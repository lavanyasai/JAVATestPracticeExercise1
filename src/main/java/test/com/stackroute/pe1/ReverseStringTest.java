package test.com.stackroute.pe1;

import com.stackroute.pe1.ReverseString;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString reverseString;
    String expectedResult;
    String actualResult;

    @org.junit.Before
    public void setUp() throws Exception {
        reverseString = new ReverseString();
    }

    @Test
    public void checkWhetherTheReverseOfAStringIsCorrect() {
        expectedResult = reverseString.reverseString("london");
        actualResult = "nodnol";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherTheReturnedReverseOfAStringIsCorrect() {
        expectedResult = reverseString.reverseString("stack");
        actualResult = "kcats";
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        reverseString = null;
    }
}