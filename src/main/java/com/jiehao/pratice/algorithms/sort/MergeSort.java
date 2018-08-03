package com.jiehao.pratice.algorithms.sort;
public class MergeSort{
    public static int[] excute(int[] in){
        return in;
    }
    public static void sort(int[] in,int left,int right){
        if(left < right){
            int mid = (right + left) / 2;
            sort(in,left,mid);
            sort(in,mid + 1,right);
            merge(in,left,right);
        }
    }
    public static void merge(int[] in,int left,int right){
        
    }
}