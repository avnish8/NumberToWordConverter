package com.avnishsrivastava.util;

public class ThreeDigitsToWordProcessor {

    DigitToWordConverter converter;

    public ThreeDigitsToWordProcessor() {
        converter = new DigitToWordConverter();
    }

    public String process(int n) {
        int hundred = n / 100;
        int tensAndUnits = n / 10;
        int tens = (n / 10) % 10;
        int units = n % 10;

        String result = "";

        if (hundred > 0) {
            result += converter.units(hundred);
            result += "hundred ";
            if (tensAndUnits != 0) {
                result += "and ";
            }
        }
        if (tensAndUnits > 10 && tensAndUnits < 20) {
            result += converter.tensCol2(tensAndUnits);
        }
        else {
            if (tens > 0) {
                result += converter.tens(tens);
            }
            if (units > 0) {
                result += converter.units(units);
            }
        }
        return result;
    }
}
