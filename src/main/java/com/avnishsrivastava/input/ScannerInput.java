package com.avnishsrivastava.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/*
 *  Created by: Avnish Srivastava
 *  github    : www.github.com/avnish8
 *  email     : avnishsrivastava@virtusa.com
 *
 *  This class helps in getting input from "resources/input.txt" file
 *  and returning a list of numbers
 *
 *  Throws Runtime Exception if
 *  - File is not found
 *  - Input is not an integer
 *
 * */

public class ScannerInput implements IUserInput {

    private Scanner input;
    private String filePath;

    public ScannerInput(String str) {
        try{
            this.filePath = str;
            File inFile = new File(filePath);
            this.input = new Scanner(inFile);
        }
        catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
            throw new RuntimeException("FileNotFoundException");
        }
    }

    public List<Integer> getNumbersListFromInput() {

        ArrayList<Integer> numbers = new ArrayList<>();

        while (input.hasNextLine()) {
            try {
                int number = input.nextInt();
                if (number <= 0 || number > 999999999) {
                    System.out.println("Wrong Input Exception");
                    throw new RuntimeException("Input must be > 0 and < 1,000,000,000");
                }
                numbers.add(number);
            } catch (InputMismatchException e) {
                System.out.println("Input Mismatch Exception");
                e.printStackTrace();
                throw new RuntimeException("InputMismatchException");
            }
        }

        return numbers;
    }

}
