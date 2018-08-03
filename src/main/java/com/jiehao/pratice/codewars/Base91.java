package com.jiehao.pratice.codewars;

public class Base91 {
    //private char[] codeList = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&()*+,./:;<=>?@[]^_`{|}~\"".toCharArray();
    public static String encode(String data) {
        char[] chars = data.toCharArray();
        StringBuilder builder = new StringBuilder();
        String byteStr;
        for (char c : chars){
            byteStr = Integer.toBinaryString(c);
            for (int i = 0; i < 8 - byteStr.length(); i ++){
                builder.append("0");
            }
            builder.append(byteStr);
        }
        //int mod = builder.length();
        return new String(builder); // do it!c
    }
    public static String decode(String data) {
        return new String(); // do it!
    }
}
