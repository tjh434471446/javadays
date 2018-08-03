package com.jiehao.pratice.lectcode;

import java.util.Arrays;

public class MediaNumber {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        nums1 = Arrays.copyOf(nums1, length1 + length2);//数组扩容
        System.arraycopy(nums2, 0, nums1, length1, length2);
        Arrays.sort(nums1);
        boolean evenFlag = nums1.length % 2 == 0;
        return evenFlag?(double) (nums1[nums1.length / 2] + nums1[nums1.length / 2 - 1]) /2:nums1[nums1.length / 2];
    }
    public static void test(){
        MediaNumber mediaNumber = new MediaNumber();
        int[] a = {1,2,5,6};
        int[] b = {4,3,9};
        System.out.println(mediaNumber.findMedianSortedArrays(a,b));
    }
}
