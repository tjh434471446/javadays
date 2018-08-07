package com.jiehao.pratice.lectcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class BullsAndCowsTest {

    @Test
    public void getHint() {
        BullsAndCows bullsAndCows = new BullsAndCows();
        String secret = "1122";
        String guess = "1222";
        String expected = "3A0B";
        String actual = bullsAndCows.getHint(secret,guess);
        assertEquals(expected,actual);
    }
}