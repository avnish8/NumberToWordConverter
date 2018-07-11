package com.avnishsrivastava.util;

import java.util.ArrayList;
import java.util.List;
import com.avnishsrivastava.processor.INumberToWordProcessor;

public class ThreeDigitsToWordProcessor implements INumberToWordProcessor {

    private DigitToWordConverter digitToWordConverter;

    public ThreeDigitsToWordProcessor() {
        digitToWordConverter = new DigitToWordConverter();
    }


    public List<String> decode(List<Integer> numbers) {
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

        return process(threeDigits) + SuffixData.get(part);
    }


    public String process(int n) {

        String finalString = "";

        for (int i = 0, k = n; i < 3; i++, n /= 10) {
            String str = processHelper(n % 10, i, k % 100);
            finalString = str + finalString;
        }

        return finalString;
    }


    private String processHelper (int digit, int place, int lastTwoDigits) {

        //the digit is at units place
        if (place == 0) {
            if (lastTwoDigits > 10 && lastTwoDigits < 20)
                return "";
            if (digit > 0) {
                return digitToWordConverter.units(digit);
            }
        }

        //the digit is at tens place
        else if (place == 1) {
            String finalString = "";
            if (digit > 0) {
                if (lastTwoDigits > 10 && lastTwoDigits < 20)
                    finalString += digitToWordConverter.tensCol2(lastTwoDigits);
                else
                    finalString += digitToWordConverter.tens(digit);
            }
            return finalString;
        }

        //the digit is at hundreds place
        else {
            if (digit > 0)
                return digitToWordConverter.hundreds(digit) + (lastTwoDigits > 0 ? "and " : " ");
        }

        return "";
    }
}
