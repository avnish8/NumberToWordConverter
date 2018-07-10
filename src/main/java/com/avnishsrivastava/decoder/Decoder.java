package com.avnishsrivastava.decoder;

import com.avnishsrivastava.input.UserInput;
import com.avnishsrivastava.util.ThreeDigitsToWordProcessor;

public class Decoder {

    private UserInput in;
    private ThreeDigitsToWordProcessor threeDigitsToWordProcessorProcessor;

    public Decoder(UserInput in) {
        this.in = in;
        threeDigitsToWordProcessorProcessor = new ThreeDigitsToWordProcessor();
    }

    public String decode() {
        int number = in.getInt();

        String unit = "";
        String thousand = "";
        String million = "";


        int last3 = number % 1000;
        if (last3 > 0)
            unit = threeDigitsToWordProcessorProcessor.process(last3);

        int mid3 = (number / 1000) % 1000;
        if (mid3 > 0)
            thousand = threeDigitsToWordProcessorProcessor.process(mid3) + "thousand ";

        int first3 = number / 1000000;
        if (first3 > 0)
            million = threeDigitsToWordProcessorProcessor.process(first3) + "million ";

        return million + thousand + unit;
    }
}
