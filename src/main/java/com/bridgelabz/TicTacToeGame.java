package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
    public static void chooseOption () {

        char computersSymbol = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("give the  option 'o' or 'x' : ");
        char option = sc.next().charAt(0);


        if ( option=='o') {
            computersSymbol='x';
        } else if (option=='x'){
            computersSymbol='0';
        } else {
            System.out.print("invalied option: ");
        }
        System.out.println("Players option : "+ option+"\nand computers option is : "+computersSymbol);

    }

    public static void main(String[] args) {
        System.out.println("Welcome to the TicTacToe Game");
        Scanner scanner = new Scanner(System.in);
        chooseOption();

        char[][] gameBoard = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

        System.out.println(gameBoard[0][0] + "|" + gameBoard[0][1] + "|" + gameBoard[0][2]);
        System.out.println("-+-+-");
        System.out.println(gameBoard[1][0] + "|" + gameBoard[1][1] + "|" + gameBoard[1][2]);
        System.out.println("-+-+-");
        System.out.println(gameBoard[2][0] + "|" + gameBoard[2][1] + "|" + gameBoard[2][2]);

    }
}
