package com.company;

public class ContestKeepMultiplying {
    public int findFinalValue(int[] nums, int original){
        for( int num : nums){
            if ( num == original){
                original = 2 * original;
            }
            for (int num1 : nums){
                if (num1 == original) {
                    original = 2 * original;
                }
            }
        }
        return original;

    }
    public static void main(String[] args) {

       int[] nums = {8,19,4,2,15,3};
        int original = 2;
        ContestKeepMultiplying ckm = new ContestKeepMultiplying();
        int res = ckm.findFinalValue(nums,original);
        System.out.println(res);
    }
}
