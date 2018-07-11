package com.avnishsrivastava.processor;

import java.util.ArrayList;
import java.util.List;
import com.avnishsrivastava.util.DigitToWordConverter;
import com.avnishsrivastava.util.SuffixData;

/*
 *  Created by: Avnish Srivastava
 *  github    : www.github.com/avnish8
 *  email     : avnishsrivastava@virtusa.com
 *
 *  This class has a decode method which converts each number into
 *  its respective british english and stores the string in finalResults list object
 *  and finally return the finalResults list object
 *
 * */

public class ThreeDigitsToWordProcessor implements INumberToWordProcessor {

    private DigitToWordConverter digitToWordConverter;

    public ThreeDigitsToWordProcessor() {
        digitToWordConverter = new DigitToWordConverter();
    }

    // return the list of numbers in british english
    public List<String> decode(List<Integer> numbers) {

        List<String> finalResults = new ArrayList<>();

        for (int number : numbers) {

            String finalString = "";
            for (int i = 0; number > 0; i++, number /= 1000) {

                //isolate last 3 digits and process them
                //at last joining the result
                int threeDigits = number % 1000;

                String str = decodeHelper(threeDigits, i);

                finalString = str + finalString;
            }

            finalResults.add(finalString.trim());
        }
        return finalResults;
    }

    // helper method for decode
    // Suffix Data.get(part) return thousand, million, billion etc depending on part
    private String decodeHelper(int threeDigits, int part) {

        return process(threeDigits) + SuffixData.get(part);
    }

    /*
    this method convert 3 digit into word form
    ex - 321 to "Three hundred and twenty one"
     */
    public String process(int n) {

        String finalString = "";

        for (int i = 0, k = n; i < 3; i++, n /= 10) {
            String str = processHelper(n % 10, i, k % 100);
            finalString = str + finalString;
        }

        return finalString;
    }

    //helper method for process
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
