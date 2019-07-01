package test.com.stackroute.pe1;

import com.stackroute.pe1.RepeatWords;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatWordsTest {

    RepeatWords repeatWords;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        repeatWords = new RepeatWords();
    }

    @Test
    public void checkWhetherWordIsRepeated() {
        actualResult = repeatWords.repeatSpecifiedWords("Stackroute", 5);
        expectedResult = "Stackrouterouterouterouterouteroute";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherResultWordIsRepeated() {
        actualResult = repeatWords.repeatSpecifiedWords("Stackroute", 2);
        expectedResult = "Stackroutetete";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        repeatWords = null;
    }
}