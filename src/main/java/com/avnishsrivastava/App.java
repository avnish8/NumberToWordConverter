package com.avnishsrivastava;

import com.avnishsrivastava.decoder.Decoder;
import com.avnishsrivastava.input.ScannerInput;

public class App 
{
    private static ScannerInput input = new ScannerInput();
    private static Decoder decoder = new Decoder(input);


    public static void main( String[] args )
    {
        for (String str : decoder.decode())
            System.out.println(str);
    }
}