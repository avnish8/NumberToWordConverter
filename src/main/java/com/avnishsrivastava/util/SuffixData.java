package com.avnishsrivastava.util;

/*
 *  Created by: Avnish Srivastava
 *  github    : www.github.com/avnish8
 *  email     : avnishsrivastava@virtusa.com
 *
 *  A simple utility class to help convert the numbers to british english
 *
 *  A simple modification to this class will allow conversion of much higher numbers.
 *
 * */

public class SuffixData {
    public static String get(int i) {
        switch (i) {
            case 0:
                return "";
            case 1:
                return "thousand ";
            case 2:
                return "million ";
            case 3:
                return "billion ";
            case 4:
                return "trillion ";
            default:
                System.out.println("Number Too Large");
                throw new RuntimeException("Number Too Large");
        }
    }
}
