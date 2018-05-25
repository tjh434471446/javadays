package com.jiehao.pratice.algorithms.sort;
public class BubbleSort{
    public static int[] excute(int[] in){
        for(int i = 0; i < in.length - 1; i++){
            for(int j = 0; j < in.length - i -1; j++){
                if(in[j] > in[j + 1]){
                    in[j + 1] = in[j] + in[j + 1];
                    in[j] = in[j + 1] - in[j];
                    in[j + 1] = in[j + 1] - in[j];
                }
            }
        }
        return in;
    }
}