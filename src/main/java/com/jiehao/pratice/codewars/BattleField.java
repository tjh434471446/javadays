package com.jiehao.pratice.codewars;

import java.util.ArrayList;

/**
 * Battleship field validator
 * https://www.codewars.com/kata/52bb6539a4cf1b12d90005b7
 */
public class BattleField {
    private static boolean fieldValidator(int[][] field) {
        // your code here!

        ArrayList<Point> checkedList = new ArrayList<>();
        // 定义船下标表示size值为个数
        int[] numLimit = {0,4,3,2,1};
        int x,y;
        int top,bottom,left,right,lefttop,righttop,leftbottom,rightbottom;
        boolean checkFlag;
        // 遍历整个矩阵将检查过的点依次加入list
        for (int col = 0;col < field[0].length;col ++){
            for (int row = 0;row < field.length;row ++){
                if (checkContain(row,col,checkedList)){
                    continue;
                }
                // 设置为船的起点
                if (field[row][col] == 1){
                    x = row;y = col;
                    checkedList.add(new Point(x , y));
                    checkFlag = true;
                    int count = 1;
                    // 实现题目规则
                    while(checkFlag){
                        top = 0;bottom = 0;left = 0;right = 0;lefttop = 0;righttop = 0;leftbottom = 0;rightbottom = 0;
                        if ((x > 0)&&(field[x - 1][y] == 1)&&(!checkContain(x -1,y,checkedList))){
                            top = 1;
                            checkedList.add(new Point(x -1,y));
                        }
                        if ((y > 0)&&(field[x][y - 1] == 1)&&(!checkContain(x,y - 1,checkedList))){
                            left = 1;
                            checkedList.add(new Point(x,y -1));
                        }
                        if ((x < field.length)&&(field[x + 1][y] == 1)&&(!checkContain(x + 1,y,checkedList))){
                            bottom = 1;
                            checkedList.add(new Point(x + 1,y));
                        }
                        if ((y < field[0].length)&&(field[x][y + 1] == 1)&&(!checkContain(x,y + 1,checkedList))){
                            right = 1;
                            checkedList.add(new Point(x,y + 1));
                        }
                        if ((x > 0)&&(y > 0)&&(field[x - 1][y - 1] == 1)){
                            lefttop = 1;
                        }
                        if ((x > 0)&&(y < field[0].length)&&(field[x - 1][y + 1] == 1)){
                            righttop = 1;
                        }
                        if ((x < field.length)&&(y > 0)&&(field[x + 1][y - 1] == 1)){
                            leftbottom = 1;
                        }
                        if ((x < field.length)&&(y < field[0].length)&&(field[x + 1][y + 1] == 1)){
                            rightbottom = 1;
                        }
                        if (lefttop + leftbottom + righttop + rightbottom > 0){
                            return false;
                        }
                        if (top + bottom + left + right > 1){
                            return false;
                        }
                        if (top + bottom + left + right != 1){
                            numLimit[count] --;
                            checkFlag = false;
                        }
                        x = top == 1? x -1:x;x = bottom == 1? x +1:x;
                        y = left == 1? y - 1:y;y = right == 1?y + 1:y;
                        count ++;
                    }
                }
            }
        }
        for (int i:numLimit){
            if (i != 0){
                return false;
            }
        }
        return true;
    }

    private static boolean checkContain(int x, int y, ArrayList<Point> checkedList){
        for (Point p:checkedList){
            if (p.equals(x,y)){
                return true;
            }
        }
        return false;
    }
    static class Point{
        int x;
        int y;
        Point(int x,int y){
            this.x = x;
            this.y = y;
        }
        boolean equals(Point point){
            return (this.x == point.x) && (this.y == point.y);
        }
        boolean equals(int x,int y){
            return (this.x == x) && (this.y == y);
        }
    }
    public static void test(){
        /*
        int[][] battleField = {
                {1, 0, 0, 0, 0, 1, 1, 0, 0, 0},
                {1, 1, 1, 0, 0, 0, 0, 0, 1, 0},
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
                */
        int[][] battleField1 = {
                {1, 0, 0, 0, 0, 1, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 0, 0, 0, 1, 0},
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        System.out.println(fieldValidator(battleField1));
    }
}
