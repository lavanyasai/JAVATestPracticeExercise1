package test.com.stackroute.pe1;

import com.stackroute.pe1.ScannerIntegers;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScannerIntegersTest {

    ScannerIntegers scannerIntegers;
    int expectedResult;
    int actualResult;

    @org.junit.Before
    public void setUp() throws Exception {
        scannerIntegers = new ScannerIntegers();
    }

    @Test
    public void checkWhetherNumbersAreScannedAndAdded() {
        expectedResult = scannerIntegers.readIntegersAndAddThem(new int[]{10, 20, 30, 0});
        actualResult = 60;
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        scannerIntegers = null;
    }
}