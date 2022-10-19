package com.yellow;

import java.util.HashSet;

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

    public void rotate(int[] nums, int k) {
        k%=nums.length;
        if(nums.length!=1) {
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
        }
    }

    public void reverse(int[] nums,int start,int end){
        while (start<end){
            int temp=nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
        }
    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            boolean add = integers.add(nums[i]);
            if(!add){
                return true;
            }
        }
        return false;
    }
}
