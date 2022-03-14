package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CWHFileHandling {
    public static void main(String[] args) throws IOException {

        try {
            File file = new File("F:/hello1");
            if(file.exists()){
                System.out.println("This file existed");
            }else{
            file.createNewFile();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
       try{
           FileWriter fileWriter =new FileWriter("F:/hello1");
       }catch (IOException e){

       }
//       // fileWriter.write("Hello welcome to my program\nenjoy the program");
//        fileWriter.close();}
//        catch (IOException e1){
//            System.out.println("Some problem occur");
//            e1.printStackTrace();
      //  }
        File myFile = new File("F:/hello1");
        Scanner sc = new Scanner(myFile);
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
//            System.out.println(myFile);
        }
        sc.close();
//
        File deleteFile = new File("F:/hell");
        if(deleteFile.delete()){
            System.out.println("You successfully delete the file");
        }else {
            System.out.println("This file does not exist ");
        }
        File informationFile = new File("F:/hello1");
        if(informationFile.exists()){
            System.out.println("The name of file : " + informationFile.getName());
            System.out.println("Absolute path of file : " + informationFile.getPath());
            System.out.println("Writable : " + informationFile.canWrite());
            System.out.println("Readable : " + informationFile.canRead());

        }else {
            System.out.println("This file does does not exist ");
        }





    }
}
