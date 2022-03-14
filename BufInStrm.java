package com.company;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufInStrm {
    public static void main(String[] args) throws IOException {
//        try{
//            FileInputStream inFile = new FileInputStream("abc.txt");
//            BufferedInputStream bInF = new BufferedInputStream(inFile);
//             int i = 0;
//             while ((i = bInF.read()) != -1 ){
//                 System.out.print((char) i );
//             }
//             inFile.close();
//             bInF.close();
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        FileInputStream inFile = new FileInputStream("abc.txt");
        BufferedInputStream bInF = new BufferedInputStream(inFile);
        int size = bInF.available();
        for ( int i = size-1 ; i >0; i-- ){
            bInF.mark(i);
            bInF.skip(i);
            System.out.print((char) bInF.read());
            bInF.reset();
        }
        inFile.close();
        bInF.close();
    }
}
