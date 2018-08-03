package com.jiehao.pratice.lectcode;

public class RainWater {
    public int trap(int[] height) {
        int left = 0;
        int minus = 0;
        for(int i = 1; i < height.length; i++){
            minus = minus + height[i];
            if (height[i] >= height[left]){
                left = i;
                //sum = sum + Math.max(height[left])
            }
        }
        return 0;
    }

}
