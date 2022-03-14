package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class FileInputStrm {
    public static void main(String[] args) {
        try {
            FileInputStream inFile = new FileInputStream("F:\\Xyz Work.txt");
            int i = 0;
            while (( i = inFile.read()) != -1 ){
                System.out.print((char) i);
            }

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
