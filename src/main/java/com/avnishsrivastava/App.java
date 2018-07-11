package com.avnishsrivastava;

import com.avnishsrivastava.decoder.Decoder;
import com.avnishsrivastava.input.IUserInput;
import com.avnishsrivastava.input.ScannerInput;
import com.avnishsrivastava.processor.INumberToWordProcessor;
import com.avnishsrivastava.processor.ThreeDigitsToWordProcessor;

/*
 *  Created by: Avnish Srivastava
 *  github    : www.github.com/avnish8
 *  email     : avnishsrivastava@virtusa.com
 *
 *  -- Java Program to convert "Numbers" in resources/input.txt file to their
 *     their respective British English Words.
 *
 *  -- I've put a lot of effort in keeping this code Flexible, Robust and Reusable
 *     while adhering to OO Design.
 *
 *  -- The Solid principles have been applied by me throughout the project wherever
 *     it made sense to me.
 *
 *  -- Example of future updates to the software that'll be very easy to implement in code
 *   - Change of input Method (This version of code uses java.util.Scanner class to read
 *     input)
 *   - Change in the logic of decoding will just require creating a new object of class that
 *     implements the interface INumberToWordProcessor and injecting it into decoder object below.
 *   - Processing numbers much higher than 999,999,999
 *   - Convert to words other than in British English
 *
 *  Any feedback is welcome.
 * */

public class App 
{
    //input file
    private static final String filePath = "src/main/java/com/avnishsrivastava/resources/input.txt";

    // applied Strategy Design Pattern / Dependency Inversion
    private static IUserInput input = new ScannerInput(filePath);


    // applied Strategy Design Pattern / Dependency Inversion
    private static INumberToWordProcessor processor = new ThreeDigitsToWordProcessor();

    private static Decoder decoder = new Decoder(input, processor);

    public static void main( String[] args )
    {
        for (String str : decoder.decode())
            System.out.println(str);
    }
}