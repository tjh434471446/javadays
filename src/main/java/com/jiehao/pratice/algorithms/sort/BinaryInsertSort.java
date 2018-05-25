package com.jiehao.pratice.algorithms.sort;
public class BinaryInsertSort{
    public int[] excute(int[] in){
        for(int i = 1; i < in.length; i++){
            int left = 0;
            int right = i - 1;
            int mid = 0;
            int temp = in[i];
            while(left <= right){
                mid = (right + left) / 2;
                if(temp > in[mid]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            int j = 0;
            for(j = i -1; i >= left ; j--){
                in[j + 1] = in[j];
            }
            in[j + 1] = temp;
        }
        return in;
    }
}