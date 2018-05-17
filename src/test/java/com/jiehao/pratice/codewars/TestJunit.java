package com.jiehao.pratice.codewars;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import com.jiehao.pratice.algorithms.sort.DirectInsertSort;
import com.jiehao.pratice.junit.MessageUtil;

import org.junit.Test;

public class TestJunit{
    String message = "Hello world";
    MessageUtil messageUtil = new MessageUtil(message);
    
    @Test
    public void testPrintMessage(){
        assertEquals(message, messageUtil.printMessage());
    }

    @Test
    public void testAdd(){
        String string = "Junit is working fine";
		String str = string;
        assertEquals(string,str);
    }
    @Test
    public void testKataNextSmaller(){
        long n = 1;
        assertEquals(n, Kata.nextSmaller(n));
    }
    @Test
    public void testKataUnflatten(){
        Object[] input = new Object[]{4,5,1,7,1};
        Object[] expected = new Object[]{new Object[]{4,5,1,7},1};
        assertArrayEquals(expected, Kata.unflatten(input, 1));
    }
    @Test
    public void testDirectInsertSort(){
        int[] input = new int[]{1,5,9,6,3,2,4,7};
        int[] expected = new int[]{1,2,3,4,5,6,7,9};
        assertArrayEquals(expected, DirectInsertSort.excute(input));
    }
}