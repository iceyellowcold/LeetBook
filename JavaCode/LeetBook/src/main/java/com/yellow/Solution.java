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
        int index=1;
        for(int i=1;i<nums.length;i++){


            if(nums[i]==nums[index-1]){
                continue;
            }
            nums[index]=nums[i];
            index++;
            count++;
        }
        return count;
    }

    public int maxProfit(int[] prices) {
        int[] nums = new int[prices.length-1];
        int totals=0;
        for (int i = 1; i < prices.length; i++) {
            nums[i-1]=prices[i]-prices[i-1];
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                totals+=nums[i];
            }
        }
        return totals;
    }
}
