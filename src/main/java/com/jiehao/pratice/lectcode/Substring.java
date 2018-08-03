package com.jiehao.pratice.lectcode;

import java.util.ArrayList;

/**
 * Substring
 */
public class Substring {
    public int lengthOfLongestSubstring(String s) {
        if (s.equals("")){
            return 0;
        }
        char[] chars = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        int max = 1;
        for (int i = 0 ;i < chars.length - 1; i++){
            if (chars.length - i < max) {
                break;
            }
            list.add(chars[i]);
            for (int j = i + 1; j < chars.length; j++){
                if (list.contains(chars[j])){
                    max = max > list.size()? max:list.size();
                    list.clear();
                    break;
                }
                if (!list.contains(chars[j])){
                    list.add(chars[j]);
                }
                if (j == chars.length - 1){
                    max = max > list.size()? max:list.size();
                    list.clear();
                    break;
                }
            }
        }
        max = max > list.size()? max:list.size();
        return max;
    }
}