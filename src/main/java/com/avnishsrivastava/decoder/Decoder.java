package com.avnishsrivastava.decoder;

import com.avnishsrivastava.input.IUserInput;
import com.avnishsrivastava.processor.INumberToWordProcessor;
import java.util.List;

/*
 *  Created by: Avnish Srivastava
 *  github    : www.github.com/avnish8
 *  email     : avnishsrivastava@virtusa.com
 *
 *  This class takes input of numbers via a "IUserInput" object
 *  numbers are returned as a list
 *
 *  The "INumberToWordProcessor" object has a decode method which
 *  take in a list of integers and
 *  returns the list of words of numbers in British English
 *
 * */


public class Decoder {

    private IUserInput NumberInput;
    private INumberToWordProcessor processor;


    public Decoder(IUserInput input, INumberToWordProcessor processor) {
        this.NumberInput = input;
        this.processor = processor;
    }


    public List<String> decode() {

        List<Integer> numbers = NumberInput.getNumbersListFromInput();
        return processor.decode(numbers);
    }

}
