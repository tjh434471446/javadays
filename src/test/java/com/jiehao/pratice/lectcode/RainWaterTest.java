package com.jiehao.pratice.lectcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class RainWaterTest {
    @Test
    public void testRainWater(){
        int[] input = {0,1,0,2,1,0,1,3,2,1,2,1};
        RainWater rainWater = new RainWater();
        int expect = 6;
        assertEquals(expect,rainWater.trap(input));
    }
}