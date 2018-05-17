package com.jiehao.pratice.algorithms;

import static org.junit.Assert.assertArrayEquals;

import com.jiehao.pratice.algorithms.sort.DirectInsertSort;

import org.junit.Test;

public class TestJunit{
    @Test
    public void testDirectInsertSort(){
        int[] input = new int[]{1,5,9,6,3,2,4,7};
        int[] expected = new int[]{1,2,3,4,5,6,7,9};
        assertArrayEquals(expected, DirectInsertSort.excute(input));
    }
}