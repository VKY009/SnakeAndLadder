package com.java;

import java.util.Random;

public class SnakeLadder {
    public static final int BoardSize = 100;
    public static Random random = new Random();
    public static void main(String[] args) {
        int player1Position = 0;
        int player2Position = 0;
        int diceRollCount=0;
        while (player1Position < BoardSize && player2Position<BoardSize) {
            diceRollCount++;
            System.out.println("Player 1 turn");
            int diceRoll=(int)(Math.random()*6)+1;
            int option = random.nextInt(3);
            switch (option) {
                case 0:
                    System.out.println("No play: player stays in the same position");
                    break;
                case 1:
                    System.out.println("Ladder: player moves ahead by "+diceRoll+" position");
                    player1Position += diceRoll;
                    if (player1Position>BoardSize){
                        player1Position=BoardSize-(player1Position-BoardSize);
                    }
                    break;
                case 2:
                    System.out.println("Snake: player moves behind by "+diceRoll+" position");
                    player1Position -= diceRoll;
                    if (player1Position<0){
                        player1Position=0;
                    }
                    break;
            }
            System.out.println(player1Position);
            if (player1Position==BoardSize){
                System.out.println("Player 1 wins !!");
                break;
            }
            System.out.println("Player 2 turn");
            diceRoll=(int)(Math.random()*6)+1;
            switch (option) {
                case 0:
                    System.out.println("No play: player stays in the same position");
                    break;
                case 1:
                    System.out.println("Ladder: player moves ahead by "+diceRoll+" position");
                    player2Position += diceRoll;
                    if (player2Position>BoardSize){
                        player2Position=BoardSize-(player2Position-BoardSize);
                    }
                    break;
                case 2:
                    System.out.println("Snake: player moves behind by "+diceRoll+" position");
                    player2Position -= diceRoll;
                    if (player2Position<0){
                        player2Position=0;
                    }
                    break;
            }
            System.out.println(player2Position);
            if (player2Position==BoardSize){
                System.out.println("Player 2 wins !!");
                break;
            }
        }
        System.out.println("Congratulation on reaching 100 with "+diceRollCount+" dice rolls");
    }
}
