package com.avnishsrivastava;

import com.avnishsrivastava.decoder.Decoder;
import com.avnishsrivastava.input.UserInput;

public class App 
{
    private static UserInput input = new UserInput();
    private static Decoder decoder = new Decoder(input);

    public static void main( String[] args )
    {
        for (String str : decoder.decode())
            System.out.println(str);
    }
}

/*
    Decode can be improved (coding standards)

 */