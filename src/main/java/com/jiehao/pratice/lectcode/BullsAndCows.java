package com.jiehao.pratice.lectcode;
import java.util.HashMap;
import java.util.Map;

public class BullsAndCows {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        Map<Character,Integer> map = new HashMap();
        int[] checkList = new int[secret.length()];
        for (int i = 0; i < secret.length(); i++){
            char ch = secret.charAt(i);
            if (ch == guess.charAt(i)){
                checkList[i] = -1;
                bulls ++;
                continue;
            }
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch) + 1);
            }else {
                map.put(ch,1);
            }
        }
        for (int i = 0; i < guess.length(); i++){
            if (checkList[i] < 0){
                continue;
            }
            if (map.containsKey(guess.charAt(i)) && map.get(guess.charAt(i)) > 0){
                cows ++;
                map.put(guess.charAt(i),map.get(guess.charAt(i)) - 1);
            }

        }
        return bulls + "A" + cows + "B";
    }
}
