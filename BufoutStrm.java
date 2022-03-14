package com.company;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufoutStrm {
    public static void main(String[] args) {
        try {
            FileOutputStream outputStream = new FileOutputStream("abc.txt");
            BufferedOutputStream bOutF = new BufferedOutputStream(outputStream);
            String s = " hello, lets work until 12.00 clock ";
            byte[] b = s.getBytes();
            bOutF.write(b);
            bOutF.flush();
            outputStream.close();
            bOutF.close();
            System.out.println("its working ");

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
