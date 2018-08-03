package com.jiehao.pratice.lectcode;

/**
 * CountAndSay
 */
public class CountAndSay {
    public String countAndSay(int n) {
        StringBuilder builder = new StringBuilder();
        int[] numbers = new int[10];
        while (n > 10) {
            int num = n % 10;
            numbers[num] += 1;
            n = n / 10;
        }
        numbers[n] += 1;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < 1) {
                continue;
            }
            builder.append(numbers[i] + "" + i);
        }
        return builder.toString();
    }
}