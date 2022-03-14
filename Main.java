package com.company;

import java.rmi.AccessException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            int[] box = {1, 2, 3, 4, 5};
            System.out.println(box[4]);
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Your Age ");
                int age = sc.nextInt();
                if (age < 28) {
                    System.out.println("YES You are welcome");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception throw :" + e);
            } catch (Exception e2) {
                System.out.println("no access");
            }
            int i = 5, j = 5;
            int result = i + j;
            System.out.println("Your result is " + result);
        }catch(Exception e)
        {

        }


    }
}