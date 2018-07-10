package com.avnishsrivastava.util;

public class DigitToWordConverter {

    public String units(int a) {
        String[] unit = {
                "zero ",
                "one ",
                "two ",
                "three ",
                "four ",
                "five ",
                "six ",
                "seven ",
                "eight ",
                "nine ",
        };

        return unit[a];
    }

    public String tens(int a) {
        String[] ten = {
                "zero ",
                "one ",
                "twenty ",
                "thirty ",
                "fourty ",
                "fifty ",
                "sixty ",
                "seventy ",
                "eighty ",
                "ninety ",
        };
        return ten[a];
    }

    public String tensCol2(int a) {
        String[] tensOne = {
                "",
                "eleven ",
                "twelve ",
                "thirteen ",
                "fourteen ",
                "fifteen ",
                "sixteen ",
                "seventeen ",
                "eighteen ",
                "nineteen ",
        };
        return tensCol2(a - 10);
    }
}
