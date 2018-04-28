package main.java.pratice.codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class Snail {
    public static int[] snail(int[][] array) {
        // enjoy
        ArrayList<Integer> list = new ArrayList<>();
        int n = 0;
        int row = array.length;
        int col = array[0].length;
        while (n <= array.length / 2){
            for (int i = n;i < col - n;i++)
            {
                list.add(array[n][i]);
            }
            for (int i = n + 1;i < row - n;i++){
                list.add(array[i][col - n - 1]);
            }
            for (int i = col - n - 2;i >= n;i--){
                list.add(array[row - n -1][i]);
            }
            for (int i = row - n -2;i > n;i--){
                list.add(array[i][n]);
            }
            n++;
        }
        //while(n < )
        return list.stream().mapToInt(e -> e).toArray();
    }
    public static void test(){
        int[][] test = {{1,2,3,1},{4,5,6,4},{7,8,9,7},{7,8,9,7}};
        System.out.println(Arrays.toString(snail(test)));
    }
}
