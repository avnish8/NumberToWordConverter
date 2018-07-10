package com.avnishsrivastava.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DigitToWordConverterTest {

    DigitToWordConverter digitToWordConverter;

    @Before
    public void setUp() {
        digitToWordConverter = new DigitToWordConverter();
    }

    @Test
    public void unitsTest() {
        Assert.assertEquals("one", digitToWordConverter.units(1).trim());
        Assert.assertEquals("three", digitToWordConverter.units(3).trim());
        Assert.assertEquals("eight", digitToWordConverter.units(8).trim());
        Assert.assertEquals("nine", digitToWordConverter.units(9).trim());
    }

    @Test
    public void tensTest() {
        Assert.assertEquals("twenty", digitToWordConverter.tens(2).trim());
        Assert.assertEquals("thirty", digitToWordConverter.tens(3).trim());
        Assert.assertEquals("eighty", digitToWordConverter.tens(8).trim());
        Assert.assertEquals("ninety", digitToWordConverter.tens(9).trim());
    }

    @Test
    public void tensCol2Test() {
        Assert.assertEquals("eleven", digitToWordConverter.tensCol2(11).trim());
        Assert.assertEquals("twelve", digitToWordConverter.tensCol2(12).trim());
        Assert.assertEquals("sixteen", digitToWordConverter.tensCol2(16).trim());
        Assert.assertEquals("nineteen", digitToWordConverter.tensCol2(19).trim());
    }

    @Test
    public void hundredsTest() {
        Assert.assertEquals("one hundred", digitToWordConverter.hundreds(1).trim());
        Assert.assertEquals("five hundred", digitToWordConverter.hundreds(5).trim());
        Assert.assertEquals("seven hundred", digitToWordConverter.hundreds(7).trim());
        Assert.assertEquals("eight hundred", digitToWordConverter.hundreds(8).trim());
    }
}
