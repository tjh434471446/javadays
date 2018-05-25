package com.jiehao.pratice.algorithms;

import static org.junit.Assert.assertArrayEquals;

import com.jiehao.pratice.algorithms.sort.BubbleSort;
import com.jiehao.pratice.algorithms.sort.DirectInsertSort;
import com.jiehao.pratice.algorithms.sort.DirectSelectSort;
import com.jiehao.pratice.algorithms.sort.ShellSort;

import org.junit.Test;

public class TestJunit{
    int[] in = new int[]{1,5,9,6,3,2,4,7};
    int[] expecteds = new int[]{1,2,3,4,5,6,7,9};
    @Test
    public void testDirectInsertSort(){
        assertArrayEquals(expecteds, DirectInsertSort.excute(in));
    }
    @Test
    public void testBinaryInsertSort(){
        assertArrayEquals(expecteds, DirectInsertSort.excute(in));
    }
    @Test
    public void testShellSort(){
        assertArrayEquals(expecteds, ShellSort.excute(in));
    }
    @Test
    public void testDirectSelectSort(){
        assertArrayEquals(expecteds, DirectSelectSort.excute(in));
    }
    @Test
    public void testBubbleSort(){
        assertArrayEquals(expecteds, BubbleSort.excute(in));
    }
}