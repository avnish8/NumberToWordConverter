package com.avnishsrivastava.input;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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

    @Before
    public void setUp() {
        input = new ScannerInput();
    }

    @Test
    public void getNumbersListFromInputTest() {
        int j = 0;
        for (int number : input.getNumbersListFromInput()) {
            Assert.assertEquals(inputNumbers[j], number);
            j++;
        }
    }
}
