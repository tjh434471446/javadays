package com.jiehao.pratice.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NextSmaller {
    public static long nextSmaller(long n) {
        ArrayList<Long> arr = long2Arr(n);
        for (int i = 2; i <= arr.size(); i++){
            long checkNum = n % Math.round(Math.pow(10,i));
            long preFix = n - checkNum;
            long smallern = nextSmallerN(checkNum,i);
            if (smallern != -1){
                if(long2Arr(preFix + smallern).size() == arr.size()){
                    return preFix + smallern;
                }
            }
        }
        return -1;
    }
    private static long nextSmallerN(long n,int i){
        ArrayList<Long> number = long2Arr(n);
        for (int j = 0; j < i - number.size();j++){
            number.add(0,(long)0);
        }
        ArrayList<Long> digits = new ArrayList<>(number);
        Collections.sort(digits);
        long head = number.get(0);
        int index = digits.indexOf(head);
        if (index < 1){
            return -1;
        }
        long newHead = digits.get(index - 1);
        digits.remove(index - 1);
        return Math.round(newHead * Math.pow(10,digits.size())) + makeNumberByDigits(digits);
    }
    private static long makeNumberByDigits(ArrayList<Long> digits){
        long newNumber = 0;
        Collections.reverse(digits);
        int length = digits.size();
        for (long l : digits){
            newNumber = newNumber + Math.round(l * Math.pow(10,length - 1));
            length -= 1;
        }
        return newNumber;
    }
    private static ArrayList<Long> long2Arr(long n){
        ArrayList<Long> arr = new ArrayList<>();
        while (n >= 10){
            arr.add(n % 10);
            n = n / 10;
        }
        arr.add(n);
        Collections.reverse(arr);
        return arr;
    }
}
