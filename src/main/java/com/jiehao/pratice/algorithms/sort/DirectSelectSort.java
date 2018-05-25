package com.jiehao.pratice.algorithms.sort;
public class DirectSelectSort{
    public static int[] excute(int[] in){
        for(int i = 0; i < in.length; i++){
            int min = in[i];
            int minIndex = i;
            for(int j = i + 1; j < in.length; j++){
                if (in[j] < min) {
                    min = in[j];
                    minIndex = j;
                }
            }
            in[minIndex] = in[i];
            in[i] = min;
        }
        return in;
    }
}