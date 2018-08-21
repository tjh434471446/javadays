package com.jiehao.pratice.lectcode;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * FrequentElementsTest
 */
public class FrequentElementsTest {

    @Test
    public void test(){
        int[] nums = {1,1,1,2,2,3};
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        FrequentElements frequentElements = new FrequentElements();
        List<Integer> actual = frequentElements.topKFrequent(nums, 2);
        assertEquals(expected, actual);
    }
}