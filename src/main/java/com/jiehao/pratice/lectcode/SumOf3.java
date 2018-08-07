package com.jiehao.pratice.lectcode;

import java.util.*;

/**
 * SumOf3
 */
public class SumOf3 {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            int target = 0 - nums[i];
            while (j < k){
                if (nums[j] + nums[k] == target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ret.add(list);
                    while (j < k && nums[j] == nums[j + 1]){
                        j ++;
                    }
                    while (j < k && nums[k] == nums[k - 1]){
                        k --;
                    }
                    j ++;
                    k --;
                }else if (nums[j] + nums[k] < target){
                    j ++;
                }else{
                    k --;
                }
            }
        }
        return ret;
    }
    public List<List<Integer>> threeSuold(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int var : nums) {
            if (map.containsKey(var)) {
                map.put(var, map.get(var) + 1); 
            }else{
                map.put(var, 1);
            }   
        }
        List<Integer> checkList = new ArrayList<>();
        //List<Integer> checkList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int check = nums[i] + nums[j];
                checkList.add(check);
                int k = 0 - check;
                if (map.containsKey(k)) {
                    if ((k == nums[i] || k == nums[j]) && map.get(k) < 2) {
                        continue;
                    }
                    if (k == nums[i] && k == nums[j] && map.get(k) < 3) {
                        continue;
                    }
                    List<Integer> numlist = new ArrayList<>();
                    numlist.add(nums[i]);
                    numlist.add(nums[j]);
                    numlist.add(k);
                    Collections.sort(numlist);
                    if (!ret.contains(numlist)){
                        ret.add(numlist);
                    }
                }
            }
        }
        return ret;
    }
}