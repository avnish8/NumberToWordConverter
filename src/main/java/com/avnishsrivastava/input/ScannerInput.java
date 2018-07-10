package com.avnishsrivastava.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerInput implements IUserInput {

    private Scanner input;
    private String filePath;

    public ScannerInput() {
        try{
            this.filePath = "src/main/java/com/avnishsrivastava/resources/input.txt";
            File inFile = new File(filePath);
            this.input = new Scanner(inFile);
        }
        catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
            throw new RuntimeException("file not found");
        }
    }

    public List<Integer> getNumbersListFromInput() {

        ArrayList<Integer> numbers = new ArrayList<>();

        while (input.hasNextLine()) {
            int number = input.nextInt();
            numbers.add(number);
        }

        return numbers;
    }

}
