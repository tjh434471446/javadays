package com.jiehao.pratice.algorithms.sort;
public class QuickSort{
    public static int[] excute(int[] in){
        return sort(in, 0, in.length - 1);
    }
    public static int[] sort(int[] target,int left,int right){
        if(left > right){
            return target;
        }
        int i = left;
        int j = right;
        int temp = target[left];
        while(i < j){
            while((target[j] >= temp)&&(j > i)){
                j--;
            }
            while((target[i] <= temp)&&(i < j)){
                i++;
            }
            if(i < j){
                target[i] = target[i] + target[j];
                target[j] = target[i] - target[j];
                target[i] = target[i] - target[j];
            }
        }
        target[left] = target[i];
        target[i] = temp;
        target = sort(target, left, i - 1 );
        target = sort(target, i + 1, right);
        return target;
    }
}