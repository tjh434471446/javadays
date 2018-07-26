package com.jiehao.pratice.codewars;

public class SnakesLadders {
    private int[][] trans;
    private int playerNum;
    private int[] locations;
    private int next = 1;

    public SnakesLadders() {
        int[][] points = {{99,80},{95,75},{92,88},{89,68},{74,53},{64,60},{62,19},{49,11},{46,25},{16,6},{2,38},{7,14},{8,31},{15,26},{21,42},{28,84},{36,44},{51,67},{71,91},{78,98},{87,94}};
        int playerNum = 2;
        int[] locations = new int[playerNum];
        for (int i = 0; i < locations.length; i++){
            locations[i] = 0;
        }
        this.playerNum = playerNum;
        this.locations = locations;
        this.trans = points;
    }

    public SnakesLadders(int playerNum,int[][] transList) {
        int[] locations = new int[playerNum];
        for (int i = 0; i < trans.length; i++){
            locations[i] = 0;
        }
        this.playerNum = playerNum;
        this.locations = locations;
        this.trans = transList;
    }

    private int getLocation(int player){
        return locations[player - 1];
    }
    private void setLocation(int player, int gola){
        locations[player - 1] = gola;
    }
    public String play(int die1, int die2) {
        int playerNo = next;
        int location = getLocation(playerNo);
        for (int l : locations){
            if (l == 100){
                return "Game over!";
            }
        }
        location = location + die1 + die2;
        if (location > 100){
            location = 200 - location;
        }
        int gola = location;
        for (int[] t : trans){
//            System.out.println(t.getFrom());
            gola = getToByFrom(t,location);
            if (gola != location){
                break;
            }
        }
        setLocation(playerNo,gola);
        if (gola == 100){
            return "Player " + playerNum + " Wins!";
        }
        next = die1 == die2?next:next + 1;
        next = next > playerNum?next - playerNum:next;
        return "Player " + playerNo + " is on square " + gola;
    }

    private int getToByFrom(int[] point, int location) {
        if (point[0] == location){
            return point[1];
        }
        return location;
    }
}