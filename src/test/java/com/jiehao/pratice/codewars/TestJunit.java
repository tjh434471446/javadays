package com.jiehao.pratice.codewars;

import static org.junit.Assert.assertEquals;

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
}