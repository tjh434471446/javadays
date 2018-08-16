package com.jiehao.pratice.lectcode;

import java.util.Arrays;

public class Permutation {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()){
            return false;
        }
        int[] hash1 = new int[26];
        int[] hash2 = new int[26];
        for (int i = 0; i < s1.length(); i++){
            hash1[s1.charAt(i) - 'a'] += 1;
            hash2[s2.charAt(i) - 'a'] += 1;
        }
        if (Arrays.equals(hash1,hash2)){
            return true;
        }
        for (int j = 0; j <= s2.length() - s1.length() - 1; j++){
            hash2[s2.charAt(j) - 'a'] -= 1;
            //char c = s2.charAt(j);
            //char c2 = s2.charAt(j + s1.length());
            hash2[s2.charAt(j + s1.length()) - 'a'] += 1;
            if (Arrays.equals(hash1,hash2)){
                return true;
            }
        }
        return false;
    }


    String strSort(String str){
        StringBuilder builder = new StringBuilder();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (char c : arr){
            builder.append(c);
        }
        return builder.toString();
    }
    boolean checkStr(String s1,String s2){
        return s1.equals(strSort(s2));
    }
    boolean checkStrOld(String s,int[] hash){
        boolean flag = true;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            hash[c] -= 1;
            if (hash[c] < 0){
                return false;
            }
        }
        return flag;
    }
}
