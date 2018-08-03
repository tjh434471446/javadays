package com.jiehao.pratice.lectcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubstringTest {

    @Test
    public void test(){
        String s = "bwf";
        Substring substring = new Substring();
        int expecteds = 3;
        int actuals = substring.lengthOfLongestSubstring(s);
        assertEquals(expecteds, actuals);
    }
}