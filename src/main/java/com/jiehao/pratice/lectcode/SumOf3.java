package com.jiehao.pratice.lectcode;

import java.util.ArrayList;
import java.util.List;

/**
 * SumOf3
 */
public class SumOf3 {
    public List<List<Integer>> threeSum(int[] nums) {  
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> numlist = new ArrayList<>();
                        numlist.add(nums[i]);
                        numlist.add(nums[j]);
                        numlist.add(nums[k]);
                        if (!ret.contains(numlist)) {
                            ret.add(numlist);
                        }
                    }
                }
            }
        }
        return ret;
    }
    public boolean check(List<Integer> nums,List<List<Integer>> list){
        boolean flag = true;
        for (List<Integer> var : list) {
            for (int i : nums) {
                if (var.contains(i)) {
                    
                }
            }
        }
        return flag;
    }
}