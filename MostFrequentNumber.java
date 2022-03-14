package com;

public class MostFrequentNumber {
    public int mostFrequent(int[] nums, int key) {
        int[] result = {0,0};
        for (int i =0; i < nums.length;i++){
            if (nums[i]== key && i!= nums.length-1){
                int target = nums[i+1];
                int count =1;
                for (int j = i+2; j< nums.length;j++){
                    if(target == nums[j]) {
                        count++;
                    }
                    else {
                        break;
                    }
                }
                if (result[1] < count){
                    result[0] = target;
                    result[1] = count;
                }
            }
        }
        return result[0];

    }


    public static void main(String[] args) {
        int [] nums ={1,100,200,1,100};
        int key = 1;
        int res;
        MostFrequentNumber obj = new MostFrequentNumber();
        res = obj.mostFrequent(nums,key);
        System.out.println(res);
    }
}
