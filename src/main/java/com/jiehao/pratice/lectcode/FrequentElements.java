package com.jiehao.pratice.lectcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * FrequentElements
 */
public class FrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        if (nums.length == 0){
            return list;
        }
        int max = 0;
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, Comparator.comparing(Entry::getValue));
        Collections.reverse(entryList);
        for (int i = 0; i < k; i++) {
            list.add(entryList.get(i).getKey());
        }
        return list;
    }
}