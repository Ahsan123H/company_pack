package com.company;

import java.util.Scanner;

public class CWH03ExcpHandling {
    public static void main(String[] args) {
        // Handling specific exception

//        int[] array ={1,2,3,4,5,6,7,8,9,10};
//        try  ( Scanner scan = new Scanner(System.in)){
//            System.out.println("Enter the number of index :");
//            int index =scan.nextInt();
//            System.out.println("Enter the number :");
//            int number = scan.nextInt();
//            System.out.println("the value of index is : " + array[index]);
//            System.out.println("the sum of div value is :" + array[index]/number);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }catch (ArithmeticException e1){
//            System.out.println(e1);
//        }

        // optimize exception

        int[] array = {1, 2, 3, 4};
        Scanner sc = new Scanner(System.in);
        boolean pointetr = true;
        while (pointetr) {

            System.out.println("1st Enter the index of value  :");
            int ind = sc.nextInt();
            System.out.println("2nd Enter the index for value :");
            int ind1 = sc.nextInt();
            try {
                System.out.println("The sum of div num is :" + array[ind] / 2);
                try {
                    System.out.println("the index of value is : " + array[ind1]);
                    pointetr = false;
                } catch (Exception e) {
                    System.out.println("There is some issues in level 2 ");
                }
            } catch (Exception e1) {
                System.out.println("level 1 : " + e1);
            }
        }
        sc.close();

        System.out.println("you are welcome ");
    }
}