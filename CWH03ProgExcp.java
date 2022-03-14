package com.company;

import java.util.Scanner;

 class MyException extends Exception {
     public String toString() {
         return "You cann't entered ";
     }

     public String getMessage() {
         return "There is warning ";

     }
 }
public class CWH03ProgExcp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 5) {
            try {
                throw new MyException();
            }
            catch (Exception e) {
                System.out.println(e);
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            System.out.println("ok");
        }
        System.out.println("welcome to next stage ");
    }
}
