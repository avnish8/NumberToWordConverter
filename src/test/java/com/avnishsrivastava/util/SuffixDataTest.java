package com.avnishsrivastava.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SuffixDataTest {

    @Test
    public void sdTest() {
        Assert.assertEquals("", SuffixData.get(0).trim());
        Assert.assertEquals("thousand", SuffixData.get(1).trim());
        Assert.assertEquals("million", SuffixData.get(2).trim());
        Assert.assertEquals("billion", SuffixData.get(3).trim());
        Assert.assertEquals("trillion", SuffixData.get(4).trim());

//        Assert.fail(SuffixData.get(5));
    }
}
