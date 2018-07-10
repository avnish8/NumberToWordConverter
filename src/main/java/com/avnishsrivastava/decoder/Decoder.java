package com.avnishsrivastava.decoder;

import com.avnishsrivastava.input.IUserInput;
import com.avnishsrivastava.util.ThreeDigitsToWordProcessor;
import java.util.ArrayList;
import java.util.List;

public class Decoder {

    private IUserInput input;
    private ThreeDigitsToWordProcessor threeDigitsToWordProcessorProcessor;

    public Decoder(IUserInput in) {
        this.input = in;
        this.threeDigitsToWordProcessorProcessor = new ThreeDigitsToWordProcessor();
    }

    public List<String> decode() {

        List<Integer> numbers = input.getNumberListFromInput();
        List<String> Results = new ArrayList<>();

        for (int number : numbers) {

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

            Results.add(million + thousand + unit.trim());
        }
        return Results;
    }
}
