package test.com.stackroute.pe1;

import com.stackroute.pe1.VowelConsonant;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {

    VowelConsonant vowelConsonant;
    String actualResult;
    String expectedResult;
    @org.junit.Before
    public void setUp() throws Exception {
        vowelConsonant = new VowelConsonant();
    }

    @Test
    public void checkWhetherTheCharacterIsVowel() {
        actualResult = vowelConsonant.checkWhetherCharacterIsConsonantOrVowel("AE");
        expectedResult = "Vowel Vowel ";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherTheCharacterIsConsonant() {
        actualResult = vowelConsonant.checkWhetherCharacterIsConsonantOrVowel("cd");
        expectedResult = "Consonant Consonant ";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherTheCharacterIsVowelOrConsonant() {
        actualResult = vowelConsonant.checkWhetherCharacterIsConsonantOrVowel("ag@ir");
        expectedResult = "Vowel Consonant Input is not a letter Vowel Consonant ";
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        vowelConsonant = null;
    }
}