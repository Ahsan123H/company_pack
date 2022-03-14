package com.company;

public class CountOperations {
    public int countOperations(int num1, int num2) {
        int count = 0;
        while (num1 != 0 ||num2 != 0) {
            if (num1 == 0 || num2 == 0){
                return count;
            }
            if (num1 <= num2) {
                num2 = num2 - num1;
                count++;
            }else {
                num1 = num1 -num2;
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num1 = 2;
        int num2= 3;
        int res;
        CountOperations obj = new CountOperations();
       res = obj.countOperations(num1,num2);
        System.out.println(res);
    }
}
