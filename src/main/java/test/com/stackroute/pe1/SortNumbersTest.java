package test.com.stackroute.pe1;

import com.stackroute.pe1.SortNumbers;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortNumbersTest {

    SortNumbers sortNumbers;
    String expectedResult;
    String actualResult;

    @org.junit.Before
    public void setUp() throws Exception {
        sortNumbers = new SortNumbers();
    }

    @Test
    public void checkWhetherSumIsLess() {
        expectedResult = sortNumbers.sortNumbersAndAddEvenNumber("12343");
        actualResult = "False";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherSumIsGreater() {
        expectedResult = sortNumbers.sortNumbersAndAddEvenNumber("24442");
        actualResult = "True";
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        sortNumbers = null;
    }
}