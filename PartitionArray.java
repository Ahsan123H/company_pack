package com.company;

public class PartitionArray {
    public int[] pivotArray(int[] nums, int pivot) {
        int [] output = new int [nums.length];
        int left = 0;
        int right = output.length - 1;
        int tmp;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < pivot) {
                output[left] = nums[i];
                left++;
            }else if(nums[i]> pivot){
                output[right] = nums[i];
                right--;
            }
        }
        while (left <= right)
        {
            output[left] = pivot;
            left++;
        }
        return output;
        }
    public static void main(String[] args) {
       int [] nums = {9,12,5,10,14,3,10};
              int pivot = 10;
              PartitionArray pA = new PartitionArray();
        int[] ints = pA.pivotArray(nums, pivot);
        for (int i =0; i< ints.length; i++){
            System.out.printf("  %s", ints  [i] );
        }
        // how to used returned array ;
    }
}
