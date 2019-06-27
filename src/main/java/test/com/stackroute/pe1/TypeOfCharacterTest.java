package test.com.stackroute.pe1;

import com.stackroute.pe1.TypeOfCharacter;
import org.junit.Test;

import static org.junit.Assert.*;

public class TypeOfCharacterTest {

    TypeOfCharacter typeOfCharacter;
    String actualResult;
    String expectedResult;
    @org.junit.Before
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

    @org.junit.After
    public void tearDown() throws Exception {
        typeOfCharacter = null;
    }
}