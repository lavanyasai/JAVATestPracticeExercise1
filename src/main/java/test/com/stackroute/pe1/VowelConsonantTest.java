package test.com.stackroute.pe1;

import com.stackroute.pe1.VowelConsonant;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {

    VowelConsonant vowelConsonant;
    String actualResult;
    String expectedResult;

    @Before
    public void setUp() throws Exception {
        vowelConsonant = new VowelConsonant();
    }

    @Test
    public void givenStringReturnsVowel() {
        actualResult = vowelConsonant.checkWhetherCharacterIsConsonantOrVowel("AE");
        expectedResult = "Vowel Vowel ";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenStringReturnsConsonant() {
        actualResult = vowelConsonant.checkWhetherCharacterIsConsonantOrVowel("cd");
        expectedResult = "Consonant Consonant ";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenStringReturnsCharacterIsVowelOrConsonant() {
        actualResult = vowelConsonant.checkWhetherCharacterIsConsonantOrVowel("ag@ir");
        expectedResult = "Vowel Consonant Input is not a letter Vowel Consonant ";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        vowelConsonant = null;
    }
}