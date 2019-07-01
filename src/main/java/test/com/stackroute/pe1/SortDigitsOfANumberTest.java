package test.com.stackroute.pe1;

import com.stackroute.pe1.SortDigitsOfANumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortDigitsOfANumberTest {

    SortDigitsOfANumber sortDigitsOfANumber;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        sortDigitsOfANumber = new SortDigitsOfANumber();
    }

    @Test
    public void checkWhetherSumIsLess() {
        expectedResult = sortDigitsOfANumber.sortDigitsAndAddEvenDigits("12343");
        actualResult = "False";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherSumIsGreater() {
        expectedResult = sortDigitsOfANumber.sortDigitsAndAddEvenDigits("24442");
        actualResult = "True";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        sortDigitsOfANumber = null;
    }
}