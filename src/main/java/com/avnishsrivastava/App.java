package com.avnishsrivastava;

import java.util.Scanner;
import com.avnishsrivastava.input.UserInput;


public class App 
{
    static String[] units = {
        "zero",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
    };

    static String[] tens = {
        "zero",
        "one",
        "twenty",
        "thirty",
        "fourty",
        "fifty",
        "sixty",
        "seventy",
        "eighty",
        "ninety",
    };

    static String[] tensOne = {
        "",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen",
    };

    static String count(long la) {
        String result = "";
        int l = (int) la;
        if (l / 100 != 0) {
            result += units[l / 100] + " hundred ";
            result += "and ";
        }
        if ((l / 10) % 10 != 0) {
            result += tens[(l / 10) % 10] + " ";
        }
        if (l % 10 != 0) {
            result += units[l % 10];
        }
        return result;
    }

    public static void main( String[] args )
    {
        //take input
        // use dependency inversion
        UserInput in = new UserInput();
        long number = in.getLong();
        String result = "";
        if (number != 0) {
            long last3 = number % 1000;
            number /= 1000;
            result += count(last3);
            if (number != 0) {
                last3 = number % 1000;
                number /= 1000;
                String temp = count(last3) + " thousand ";
                result = temp + result;
                if (number != 0) {
                    last3 = number % 1000;
                    String temp1 = count(last3) + " million ";
                    result = temp1 + result;
                }
            }
        }
        System.out.println(result);
    }
}
