package com.jiehao.pratice.lectcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * NumArrayTest
 */
public class NumArrayTest {

    @Test
    public void test(){
        int[] nums = {1,3,5};
        NumArray numArray = new NumArray(nums);
        assertEquals(9, numArray.sumRange(0, 2));
        numArray.update(1, 2);
        assertEquals(8, numArray.sumRange(0, 2));
    }
}