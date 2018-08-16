package com.jiehao.pratice.lectcode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Dota2SenateTest {

    @Test
    public void test(){
        Dota2Senate dota2Senate = new Dota2Senate();
        String senate = "RD";
        String actual = dota2Senate.predictPartyVictory(senate);
        String expected = "Radiant";
        assertEquals(expected,actual);
    }

}