package com.avnishsrivastava.util;

public class ThreeDigitsToWordProcessor {

    private DigitToWordConverter digitToWordConverter;

    public ThreeDigitsToWordProcessor() {
        digitToWordConverter = new DigitToWordConverter();
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

        //units case
        if (place == 0) {
            if (lastTwoDigits > 10 && lastTwoDigits < 20)
                return "";
            if (digit > 0) {
                return digitToWordConverter.units(digit);
            }
        }

        //tens case
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

        //hundreds case
        else {
            if (digit > 0)
                return digitToWordConverter.hundreds(digit) + (lastTwoDigits > 0 ? "and " : " ");
        }

        return "";
    }
}
