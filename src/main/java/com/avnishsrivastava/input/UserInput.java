package com.avnishsrivastava.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput implements IUserInput {

    private Scanner input;
    private String filePath = "src/main/java/com/avnishsrivastava/resources/input.txt";


    public UserInput() {
        try{
            File inFile = new File(filePath);
            input = new Scanner(inFile);
        }
        catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
            throw new RuntimeException("file not found");
        }
    }

    public List<Integer> getNumberListFromInput() {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (input.hasNextLine()) {
            int number = input.nextInt();
            numbers.add(number);
            System.out.println(number);
        }

        return numbers;
    }

    private int getInt() {
        int number = input.nextInt();
        return number;
    }
}
