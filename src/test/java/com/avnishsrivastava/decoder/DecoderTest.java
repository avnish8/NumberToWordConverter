package com.avnishsrivastava.decoder;

import com.avnishsrivastava.input.ScannerInput;
import com.avnishsrivastava.processor.ThreeDigitsToWordProcessor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


public class DecoderTest {

    private String[] s;

    @Before
    public void setup() {
        s = new String[]{
                "one",
                "two",
                "three",
                "four",
                "five",
                "eleven",
                "twelve",
                "thirteen",
                "fourteen",
                "fifty one",
                "one hundred and five",
                "one hundred and fifty eight",
                "seven hundred and eighty nine",
                "one thousand four hundred and two",
                "fifteen thousand four",
                "two hundred and fifty thousand",
                "one million five hundred and sixty thousand",
                "fourteen million eight hundred and forty three thousand four hundred and twenty four",
                "eight hundred and eighty nine million nine hundred and ninety eight thousand twenty",
                "nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine"
        };
    }

    @Test
    public void testDecodeMethod() {
        ScannerInput input = new ScannerInput("src/main/java/com/avnishsrivastava/resources/input.txt");
        ThreeDigitsToWordProcessor processor = new ThreeDigitsToWordProcessor();
        Decoder decoder = new Decoder(input, processor);
        List<String> output = decoder.decode();

        Assert.assertNotNull(output);

        for (int i = 0; i < output.size(); i++) {
            Assert.assertEquals(s[i], output.get(i));
            Assert.assertNotNull(output.get(i));
        }
    }

}
