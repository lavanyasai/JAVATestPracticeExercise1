package test.com.stackroute.pe1;

import com.stackroute.pe1.TypeOfCharacter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TypeOfCharacterTest {

    TypeOfCharacter typeOfCharacter;
    String actualResult;
    String expectedResult;

    @Before
    public void setUp() throws Exception {
        typeOfCharacter = new TypeOfCharacter();
    }

    @Test
    public void checkTheCapitalInputCharacter() {
        actualResult = typeOfCharacter.determineTheTypeOfCharacter('Z');
        expectedResult = "Capital Letter";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkTheSymbolInputCharacter() {
        actualResult = typeOfCharacter.determineTheTypeOfCharacter('@');
        expectedResult = "Special Symbol";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        typeOfCharacter = null;
    }
}