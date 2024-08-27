package com.github.LindaHrdinova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RadialReach {
    private static void inputCheck(int input) {
        if (input % 2 == 0 || input <= 1) {
            System.err.println("This is not an odd number bigger than 1.");
            throw new IllegalArgumentException("This is not an odd number bigger than 1.");
        };
    }

    public static void main(String[] args) {

        // Loading board size
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an odd number bigger then 1, side A:");
        int boardSizeA = Integer.parseInt(scanner.nextLine());

        inputCheck(boardSizeA);

        if (boardSizeA % 2 == 0 || boardSizeA <= 1) {
            System.err.println("This is not an odd number bigger than 1.");
            return;
        }

        System.out.println("Enter an odd number bigger then 1, side B:");
        int boardSizeB = Integer.parseInt(scanner.nextLine());

        if (boardSizeB % 2 == 0 || boardSizeB <= 1) {
            System.err.println("This is not an odd number bigger than 1.");
            return;
        }

        int filling = ((boardSizeA - 1) / 2 + (boardSizeB - 1) / 2);

        int[][] board = new int[boardSizeA][boardSizeB];
        System.out.println("The size is: " + boardSizeA + " x " + boardSizeB);
        for (int i = 0; i < boardSizeA; i++) {
            for (int j = 0; j < boardSizeB; j++) {
                board[i][j] = filling;
                System.out.print(board[i][j] + "\t");


                if (j < boardSizeB / 2) {
                    filling--;
                } else {
                    filling++;
                }
            }

            if (i < boardSizeA / 2) {
                filling = filling - 2;
            }
            ;
            System.out.println();
        }
        return;
    }
}