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
        int i = 0;
        while (i + p.length() - 1 < s.length() - 1){
            char left = s.charAt(i);
            if (map.containsKey(left)){
                if (checkCharacter(i,p.length(),map)){

                }
            }else{
                i ++;
            }
        }
        return list;
    }
    boolean checkCharacter(int index,int length,Map map){
        return false;
    }
}
