package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the TicTacToe game");

        char[][] gameBoard = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

        printGameBoard(gameBoard);

        Scanner scanner = new Scanner(System.in);
        playerTurn(gameBoard, scanner);

        Random random = new Random();
        int computerPlay = random.nextInt(9) + 1;
        printGameBoard(gameBoard);

    }

    /*
     * we are checking to empty space and perform valid move what position are empty.
     */
    private static boolean isValidMove(char[][] board, String position) {
        switch (position) {
            case "1":
                return (board[0][0] == ' ');
            case "2":
                return (board[0][1] == ' ');
            case "3":
                return (board[0][2] == ' ');
            case "4":
                return (board[1][0] == ' ');
            case "5":
                return (board[1][1] == ' ');
            case "6":
                return (board[1][2] == ' ');
            case "7":
                return (board[2][0] == ' ');
            case "8":
                return (board[2][1] == ' ');
            case "9":
                return (board[2][2] == ' ');
            default:
                return false;
        }
    }

    private static void playerTurn(char[][] gameBoard, Scanner scanner) {
        System.out.println("Where would you like to play ? (1-9)");
        String playerInput = scanner.nextLine();
        System.out.println(playerInput);

        switch (playerInput) {
            case "1":
                gameBoard[0][0] = 'X';
                break;
            case "2":
                gameBoard[0][1] = 'X';
                break;
            case "3":
                gameBoard[0][2] = 'X';
                break;
            case "4":
                gameBoard[1][0] = 'X';
                break;
            case "5":
                gameBoard[1][1] = 'X';
                break;
            case "6":
                gameBoard[1][2] = 'X';
                break;
            case "7":
                gameBoard[2][0] = 'X';
                break;
            case "8":
                gameBoard[2][1] = 'X';
                break;
            case "9":
                gameBoard[2][2] = 'X';
                break;
            default:
                System.out.println(":(");
        }
    }

    private static void placeMove(char[][] board, String position, char index) {
        switch (position) {
            case "1":
                board[0][0] = index;
                break;
            case "2":
                board[0][1] = index;
                break;
            case "3":
                board[0][2] = index;
                break;
            case "4":
                board[1][0] = index;
                break;
            case "5":
                board[1][1] = index;
                break;
            case "6":
                board[1][2] = index;
                break;
            case "7":
                board[2][0] = index;
                break;
            case "8":
                board[2][1] = index;
                break;
            case "9":
                board[2][2] = index;
                break;
            default:
                System.out.println(":(");
        }
    }

    private static void printGameBoard(char[][] gameBoard) {
        System.out.println(gameBoard[0][0] + "|" + gameBoard[0][1] + "|" + gameBoard[0][2]);
        System.out.println("-+-+-");
        System.out.println(gameBoard[1][0] + "|" + gameBoard[1][1] + "|" + gameBoard[1][2]);
        System.out.println("-+-+-");
        System.out.println(gameBoard[2][0] + "|" + gameBoard[2][1] + "|" + gameBoard[2][2]);
    }



}
