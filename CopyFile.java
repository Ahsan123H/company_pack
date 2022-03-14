package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {


        try {
            FileInputStream inFile = new FileInputStream("F:\\Xyz Work.txt");
            FileOutputStream outFile = new FileOutputStream("x.txt",true);
            int i = 0;
            while ( (i = inFile.read()) != -1 ){

                outFile.write(i);
            }
            System.out.println("Congratulation");
            inFile.close();
            outFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
