package com.bridgelabz;


import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        /*
        * create a empty tic tac toe board , simulator for tic tac toe
         * game is player and computer
         */
        char [] [] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'_', '+', '_', '+', '_'},
                {' ', '|', ' ', '|', ' '},
                {'_', '+', '_', '+', '_'},
                {' ', '|', ' ', '|', ' '}};



        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your place (1-9):");
            int playerPosition = scan.nextInt();

            playerPlace(gameBoard, playerPosition, "player");

            Random  random = new Random();
            int ComputerPosition = random.nextInt(9) + 1;
            playerPlace(gameBoard, ComputerPosition, "computerPosition");

            printGameBoard(gameBoard);
        }


    }

    private static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }

    }

/*
    Method to move desire location.
 */
    private static void playerPlace(char[][] gameBoard, int position, String player) {
        char symbol = ' ';

        if(player.equals("player")) {
            symbol = 'X';
        } else if (player.equals("computer")) {
            symbol = 'O';
        }
        switch (position){
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;

        }
    }

}
