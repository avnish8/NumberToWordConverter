package com.avnishsrivastava.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserInput implements IUserInput {

    private Scanner in;
    private String filePath = "src/main/java/com/avnishsrivastava/resources/input.txt";


    public UserInput() {
        try{
            File inFile=new File(filePath);
            in = new Scanner(inFile);
        }
        catch (FileNotFoundException e) {
            System.out.println("FileNotFound");
            e.printStackTrace();
            throw new RuntimeException("file not found");
        }
    }

    public int getInt() {
        int number = in.nextInt();
        return number;
    }
}
