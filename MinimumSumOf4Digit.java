package com.company;

import java.util.Arrays;

public class MinimumSumOf4Digit {
    public int minimumSum(int num) {
        int len = 0;
        int[] nums = new int[4];
        while (num != 0) {
            nums[len++] = num % 10;
            num /= 10;
        }
       //Arays.sort(nums);
        //9 3 --> 9*10 +3 = 93 || 39
        // 9, 3 --> 9*5 == 45+3 = 48
        int new1 = (nums[0] * 10) + (nums[2]); // if i want to multiply it by 5 , then ?
        int new2 = (nums[1] * 10) +  (nums[3]);
        return  new1 + new2;

    }

    public static void main(String[] args) {
        //
        int digit =2932;
        int res =0;
        MinimumSumOf4Digit obj = new MinimumSumOf4Digit();
       res= obj.minimumSum(digit);
        System.out.println(res);
    }
}
