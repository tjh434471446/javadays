package com.jiehao.pratice.lectcode;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * PartitionLabelsTest
 */
public class PartitionLabelsTest {
    @Test
    public void test(){
        PartitionLabels partitionLabels = new PartitionLabels();
        String S = "caedbdedda";
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(9);
        List<Integer> actual = partitionLabels.partitionLabels(S);
        assertEquals(expected, actual);
    }
}