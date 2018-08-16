package com.jiehao.pratice.lectcode;

import java.util.HashMap;
import java.util.Map;

public class Dota2Senate {
    private char[] chars;
    private Map<Character,Integer> map = new HashMap<>();
    public String predictPartyVictory(String senate) {
        chars = senate.toCharArray();
        for (int i = 0; i < senate.length(); i++){
            char ch = senate.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch) + 1);
            }else{
                map.put(ch,1);
            }
        }
        String winner;
        int i = 0;
        while (map.get('R') > 0 && map.get('D') > 0){
            if (i > senate.length()){
                i = i % senate.length();
            }
            char ch = chars[i];
            if (ch == 'O'){
                i++;
                continue;
            }
            out(ch,i,chars.length);
            i++;
        }
        if (map.get('R') == 0){
            winner = "Dire";
        }else{
            winner = "Radiant";
        }
        return winner;
    }
    private void out(char part,int index,int length){
        int j = index + 1;
        while(true){
            if (j >= length){
                j = j - length;
            }
            if (chars[j] != part){
                map.put(chars[j],map.get(chars[j]) - 1);
                chars[j] = 'O';
                break;
            }
        }
    }

}
