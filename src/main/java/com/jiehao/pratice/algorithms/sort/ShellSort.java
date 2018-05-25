package com.jiehao.pratice.algorithms.sort;
public class ShellSort{
    public static int[] excute(int[] in){
        int d = in.length;
        while(true){
            d = d / 2;
            for(int x = 0; x < d; x++){
                for(int i = x + d; i < in.length; i = i + d){
                    int temp = in[i];
                    int j = 0;
                    for(j = i - d; j >= 0; j = j - d){
                        if(in[j] > temp){
                            in[j + d] = in[j];
                        }else{
                            break;
                        }
                    }
                    in[j + d] = temp;
                }
            }
            if(d == 1){
                break;
            }
        }
        return in;
    }
}