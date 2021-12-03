package com.company;

public class BinarySearch {
    public static int search(int[] nums, int target){
        if (nums==null){
            return -1;
        }else{
            int i=0;
            while (i<nums.length){
                if (nums[i]==target){
                    return i;
                }else{
                    i=i+1;
                }
            }
        }
        return -1;
    }
}
