package com.avnishsrivastava.decoder;

import com.avnishsrivastava.input.IUserInput;
import com.avnishsrivastava.util.SuffixData;
import com.avnishsrivastava.util.ThreeDigitsToWordProcessor;
import java.util.ArrayList;
import java.util.List;

public class Decoder {

    private IUserInput NumberInput;
    private ThreeDigitsToWordProcessor threeDigitsToWordProcessor;


    public Decoder(IUserInput input) {
        this.NumberInput = input;
        this.threeDigitsToWordProcessor = new ThreeDigitsToWordProcessor();
    }


    public List<String> decode() {

        List<Integer> numbers = NumberInput.getNumbersListFromInput();
        List<String> finalResults = new ArrayList<>();

        for (int number : numbers) {

            String finalString = "";
            for (int i = 0; number > 0; i++, number /= 1000) {
                int threeDigits = number % 1000;
                String str = decodeHelper(threeDigits, i);
                finalString = str + finalString;
            }

            finalResults.add(finalString.trim());
        }
        return finalResults;
    }


    private String decodeHelper(int threeDigits, int part) {

        return threeDigitsToWordProcessor.process(threeDigits) + SuffixData.get(part);
    }
}
