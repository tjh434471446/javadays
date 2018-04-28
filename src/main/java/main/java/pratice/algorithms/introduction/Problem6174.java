package main.java.pratice.algorithms.introduction;

import java.util.Arrays;

public class Problem6174 {
    public void solve6174(String start)
    {
        char[] sortChar = start.toCharArray();
        Arrays.sort(sortChar);
        String sortStr = new StringBuilder(String.valueOf(sortChar)).reverse().toString();
        String nextStr = String.valueOf(Math.abs(Integer.parseInt(sortStr) - Integer.parseInt(start)));
        while (!nextStr.equals(start))
        {
            start = nextStr;
            System.out.println(nextStr);
            sortChar = start.toCharArray();
            Arrays.sort(sortChar);
            sortStr = new StringBuilder(String.valueOf(sortChar)).reverse().toString();
            nextStr = String.valueOf(Math.abs(Integer.parseInt(sortStr) - Integer.parseInt(start)));
        }
    }
    public void test()
    {
        solve6174("1234");
    }
}
