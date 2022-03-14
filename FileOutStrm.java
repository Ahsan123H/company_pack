package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStrm {
    public static void main(String[] args) {

        try {

            FileOutputStream outFile = new FileOutputStream("xyz.txt");
            String s = "Hello here is your update";
            byte[] b = s.getBytes();
            outFile.write(b);
            outFile.close();
            System.out.println("Its working ");
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
