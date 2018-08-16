package com.jiehao.pratice.lectcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationTest {
    @Test
    public void test(){
        String s1 = "adc";
        String s2 = "dcda";
        boolean expected = true;
        Permutation permutation = new Permutation();
        boolean actual = permutation.checkInclusion(s1,s2);
        assertEquals(expected,actual);
    }

}