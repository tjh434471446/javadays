package com.jiehao.pratice.codewars;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Kata {
    static Logger logger = LogManager.getLogger();
    public static long nextSmaller(long n){
        return n;
    }
    //http://www.codewars.com/kata/unflatten-a-list-harder-than-easy/train/java
    public static Object[] unflatten(Object[] flatArray, int depth){
        int length = flatArray.length;
        int num = 0;
        ArrayList<Object> ret = new ArrayList<>();
        //int index = 0;
        for(int index = 0;index < length;index ++){
            num = (Integer)flatArray[index];
            if(num == 1){
                ret.add(num);
                continue;
            }
            if(num < length){
                ArrayList<Object> arr = new ArrayList<>();
                for(int i = 0;(i < num)&&((index + i) < length);i ++){
                    arr.add(flatArray[index + i]);
                }
                index = index + num - 1;
                ret.add(arr.toArray());
            }
        }
        logger.info("ret is "+ret.toString());
        // Object[] out = ret.toArray();
        // Object[] expected = new Object[]{new Object[]{4,5,1,7},1};
        return ret.toArray();
    }
}
