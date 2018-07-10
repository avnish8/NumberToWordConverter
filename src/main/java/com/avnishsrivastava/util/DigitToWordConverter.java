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
                "forty ",
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

        return tensOne[a - 10];
    }

    public String hundreds(int a) {
        String[] hundred = {
                "zero ",
                "one hundred ",
                "two hundred ",
                "three hundred ",
                "four hundred ",
                "five hundred ",
                "six hundred ",
                "seven hundred ",
                "eight hundred ",
                "nine hundred ",
        };

        return hundred[a];
    }
}
