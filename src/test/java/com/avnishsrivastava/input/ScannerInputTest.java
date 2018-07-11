package com.avnishsrivastava.input;

import org.junit.*;
import org.junit.rules.ExpectedException;
import java.util.List;

public class ScannerInputTest {

    ScannerInput input;
    int[] inputNumbers = {
            01,
            2,
            3,
            4,
            05,
            11,
            12,
            13,
            14,
            51,
            105,
            158,
            789,
            1402,
            15004,
            250000,
            1560000,
            14843424,
            889998020,
            999999999
    };

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Before
    public void setUp() {
        input = new ScannerInput("src/main/java/com/avnishsrivastava/resources/input.txt");
    }

    @Test
    public void getNumbersListFromInputTest() {
        int j = 0;
        List<Integer> inputList = input.getNumbersListFromInput();
        Assert.assertNotNull(inputList);
        for (int number : inputList) {
            Assert.assertEquals(inputNumbers[j], number);
            j++;
        }
    }

    @Test
    public void checkFileNotFoundException(){
        exception.expect(RuntimeException.class);
        input = new ScannerInput("src/test/java/com/avnishsrivastava/resources/input1.txt");
    }

    @Test
    public void checkInputMismatchException(){
        exception.expect(RuntimeException.class);
        input = new ScannerInput("src/test/java/com/avnishsrivastava/resources/input_mismatch.txt");
        List<Integer> inputList = input.getNumbersListFromInput();
    }

    @Test
    public void checkWrongInputException(){
        exception.expect(RuntimeException.class);
        input = new ScannerInput("src/test/java/com/avnishsrivastava/resources/wrong_input.txt");
        List<Integer> inputList = input.getNumbersListFromInput();
    }

}
