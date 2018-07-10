package com.avnishsrivastava.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ThreeDigitsToWordProcessorTest {

    ThreeDigitsToWordProcessor processor;

    @Before
    public void setUP() {
        processor = new ThreeDigitsToWordProcessor();
    }

    @Test
    public void processTest() {
        Assert.assertEquals("one", processor.process(1).trim());
        Assert.assertEquals("twelve", processor.process(12).trim());
        Assert.assertEquals("two hundred and thirty one", processor.process(231).trim());
        Assert.assertEquals("three hundred and twenty one", processor.process(321).trim());
        Assert.assertEquals("one hundred and one", processor.process(101).trim());
        Assert.assertEquals("one hundred and twenty three", processor.process(123).trim());

    }
}
