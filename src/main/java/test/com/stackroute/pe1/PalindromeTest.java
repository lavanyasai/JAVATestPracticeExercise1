package test.com.stackroute.pe1;

import com.stackroute.pe1.Palindrome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;
    String actualResult;
    String expectedResult;

    @Before
    public void setUp() throws Exception {
        palindrome = new Palindrome();
    }

    @Test
    public void givenStringReturnsStringIsPalindromeAndSumIsGreaterThan25() {
        actualResult = palindrome.checkWhetherStringIsPalindromeOrNot("2468642");
        expectedResult = "String is palindrome and sum of even numbers is greater than 25";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenStringReturnsStringIsPalindromeAndSumIsLessThan25() {
        actualResult = palindrome.checkWhetherStringIsPalindromeOrNot("123454321");
        expectedResult = "String is palindrome and sum of even numbers is less than 25";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenStringReturnsStringIsNotPalindrome() {
        actualResult = palindrome.checkWhetherStringIsPalindromeOrNot("1234");
        expectedResult = "String is not palindrome";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenStringReturnsInputIsNotValid() {
        actualResult = palindrome.checkWhetherStringIsPalindromeOrNot("aba");
        expectedResult = "Input is not valid";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        palindrome = null;
    }
}