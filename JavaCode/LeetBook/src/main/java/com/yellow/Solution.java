package com.yellow;

/**
 * @author yellow
 * @version 1.0
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0||nums==null){
            return 0;
        }
        int count=1;
        for(int i=1;i<nums.length;i++){
            int index=1;

            if(nums[i]==nums[index-1]){
                continue;
            }
            nums[index]=nums[i];
            index++;
            count++;
        }
        return count;
    }
}
