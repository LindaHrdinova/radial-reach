package com.github.LindaHrdinova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RadialReach {
    public static void main(String[] args) {

        // Loading board size
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an odd number bigger then 1:");
        int boardSizeA = Integer.parseInt(scanner.nextLine());

        // filling
        int filling = boardSizeA - 1;

        if (boardSizeA % 2 == 0 || boardSizeA <= 1) {
            System.err.println("This is not an odd number bigger than 1.");
            return;
        } else {
            int[][] board = new int[boardSizeA][boardSizeA];
            System.out.println("The size is: " + boardSizeA);
            for (int i = 0; i < boardSizeA; i++) {
                for (int j = 0; j < boardSizeA; j++) {
                    board[i][j] = filling;
                    System.out.print(board[i][j] + "\t");


                    if (j < board.length / 2) {
                        filling--;
                    } else {
                        filling++;
                    }
                }

                if (i < board.length / 2) {
                    filling = filling - 2;
                };
                System.out.println();
            }
            return;
        }
    }
}