package test.com.stackroute.pe1;

import com.stackroute.pe1.EvenOdd;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EvenOddTest {

    EvenOdd evenOdd;
    String actualResult;
    String expectedResult;

    @Before
    public void setUp() throws Exception {
        evenOdd = new EvenOdd();
    }

    @Test
    public void givenEvenNumberReturnsJerry() {
        actualResult = evenOdd.checkWhetherNumberIsEvenOrOdd(20);
        expectedResult = "Jerry";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenOddNumbersReturnsOdd() {
        actualResult = evenOdd.checkWhetherNumberIsEvenOrOdd(23);
        expectedResult = "Tom";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenOtherCharactersReturnsInputIsIncorrect() {
        actualResult = evenOdd.checkWhetherNumberIsEvenOrOdd('@');
        expectedResult = "Input is incorrect";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        evenOdd = null;
    }
}