package com.jiehao.pratice.lectcode;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * SumOf3Test
 */
public class SumOf3Test {

    @Test
    public void test(){
        SumOf3 sumOf3 = new SumOf3();
        List<List<Integer>> expected = new ArrayList<>();
        int[] a = {-1,0,1};
        int[] b = {-1,-1,2};
        expected.add(arrays2List(a));
        expected.add(arrays2List(b));
        List<List<Integer>> actual = sumOf3.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        assertEquals(expected, actual);
    }
    public List<Integer> arrays2List(int[] nums){
        List<Integer> list = new ArrayList<>();
        for (int var : nums) {
            list.add(var);
        }
        return list;
    }
}