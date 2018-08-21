package com.jiehao.pratice.lectcode;

/**
 * NumArray
 */
public class NumArray {

    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public void update(int i, int val) {
        if (i >= 0 && i < nums.length ) {
            nums[i] = val;
        }
    }
    
    public int sumRange(int i, int j) {
        int sum = 0;
        for (int n = i; i <= j; i++) {
            sum += nums[n];
        }
        return sum;
    }
}