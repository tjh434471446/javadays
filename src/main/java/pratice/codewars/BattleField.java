package main.java.pratice.codewars;

import java.util.ArrayList;

/**
 * Battleship field validator
 * tjh 20180409
 */
public class BattleField {
    public static boolean fieldValidator(int[][] field) {
        // your code here!

        ArrayList<Point> checkedList = new ArrayList<>();
        int[] numLimit = {0,4,3,2,1};
        int x,y;
        int top,bottom,left,right,lefttop,righttop,leftbottom,rightbottom;
        boolean checkFlag;
        for (int col = 0;col < field[0].length;col ++){
            for (int row = 0;row < field.length;row ++){
                //System.out.println("row :" + row + " col :" + col + " value :" + field[row][col]);
                if (checkContain(row,col,checkedList)){
                    continue;
                }
                if (field[row][col] == 1){
                    x = row;y = col;
                    checkedList.add(new Point(x , y));
                    checkFlag = true;
                    int count = 1;
                    while(checkFlag){
                        //System.out.println("x :"+x);
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

    public static boolean checkContain(int x, int y, ArrayList<Point> checkedList){
        //if (field[x + 1])
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
