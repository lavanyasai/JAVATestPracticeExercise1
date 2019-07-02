package com.stackroute.pe1;

import com.stackroute.pe1.GuessNumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuessNumberTest {

    GuessNumber guessNumber;
    String actualResult;
    String expectedResult;

    @Before
    public void setUp() throws Exception {
        guessNumber = new GuessNumber();
    }

    @Test
    public void givenNumbersReturnsNumberGuessedMatchesTheOriginalNumber() {
        actualResult = guessNumber.checkWhetherTheNumberGuessedIsCorrectOrNot(new int[]{10, 20, 30});
        expectedResult = "Number guessed matches the original number";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNumbersReturnsNumberGuessedIsNotCorrect() {
        actualResult = guessNumber.checkWhetherTheNumberGuessedIsCorrectOrNot(new int[]{10, 20});
        expectedResult = "Number guessed is not correct";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        guessNumber = null;
    }
}