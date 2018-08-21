package com.jiehao.pratice.lectcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < p.length(); i++){
            char c = p.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }else{
                map.put(c,1);
            }
        }
        return list;
    }
}
