package com.jiehao.pratice.lectcode;

public class MaxArea {
    public int maxAreaForce(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++){
            for (int j = height.length - 1; j > i; j --){
                int area = Math.min(height[i],height[j]) * (j - i);
                boolean maxFlag = area > max;
                if (maxFlag){
                    max = area;
                }
            }
        }
        return max;
    }
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        int area;
        while(j > i){
            area = Math.min(height[i],height[j]) * (j - i);
            max = Math.max(area,max);
            if (height[i] < height[j]){
                i ++ ;
            }
            else{
                j --;
            }
        }
        return max;
    }
    public static void test(){
        MaxArea area = new MaxArea();
        int[] height = {1,0,2,1,0,1,3,2,1,2,1};
        System.out.print(area.maxArea(height));
    }
}
