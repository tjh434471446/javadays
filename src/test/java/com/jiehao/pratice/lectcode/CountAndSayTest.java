package com.jiehao.pratice.lectcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * CountAndSayTest
 */
public class CountAndSayTest {

    @Test
    public void countAndSayTest(){
        CountAndSay countAndSay = new CountAndSay();
        int in = 21;
        String expected = "1211";
        String actual = countAndSay.countAndSay(in);
        assertEquals(expected, actual);
    }
}