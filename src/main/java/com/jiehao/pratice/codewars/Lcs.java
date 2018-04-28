package com.jiehao.pratice.codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lcs {
    public static String lcs(String a, String b) {
        StringBuilder builder = new StringBuilder();
        char[] strs = b.toCharArray();
        for (char c : strs)
        {
            builder.append(c).append("*");
        }
        Pattern pattern = Pattern.compile(builder.toString());
        Matcher matcher = pattern.matcher(a);
        System.out.println(matcher.find());
        while (matcher.find()){
            System.out.println("start"+ matcher.start());
            System.out.println("end"+ matcher.end());
        }
        System.out.println(builder.toString());
        return ""; // do it!
    }
}
