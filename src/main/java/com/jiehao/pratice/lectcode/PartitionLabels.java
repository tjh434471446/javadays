package com.jiehao.pratice.lectcode;

import java.util.ArrayList;
import java.util.List;

/**
 * PartitionLabels
 */
public class PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        List<Integer> ret = new ArrayList<>();
        int j = 0;
        int i = 0;
        for (int n = 0; n < S.length();){
            char ch = S.charAt(n);
            int lastIndex = S.lastIndexOf(ch);
            j = j > lastIndex?j:lastIndex;
            if (n >= j){
                ret.add(j - i + 1);
                n = j + 1;
                i = n;
                continue;
            }
            n++;
        }
        return ret;
    }
    
}