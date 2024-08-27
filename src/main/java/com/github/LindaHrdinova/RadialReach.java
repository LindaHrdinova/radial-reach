package com.github.LindaHrdinova;

import java.util.Scanner;

public class RadialReach {
    private static int inputCheck(Scanner scanner, String prompt) {
        System.out.println(prompt);
        int input = Integer.parseInt(scanner.nextLine());
        if (input % 2 == 0 || input <= 1) {
            System.err.println("This is not an odd number bigger than 1.");
            System.exit(1);
        }
        return input;
    }

    public static void main(String[] args) {
        // Loading board size
        Scanner scanner = new Scanner(System.in);

        int boardSizeA = inputCheck(scanner, "Enter an odd number bigger than 1, height:");
        int boardSizeB = inputCheck(scanner, "Enter an odd number bigger than 1, width:");

        // filling the board
        int filling = ((boardSizeA + boardSizeB - 2) / 2);

        int[][] board = new int[boardSizeA][boardSizeB];
        System.out.println("The size is: " + boardSizeA + " x " + boardSizeB);
        for (int i = 0; i < boardSizeA; i++) {
            for (int j = 0; j < boardSizeB; j++) {
                board[i][j] = filling;
                System.out.print(board[i][j] + "\t");

                // filling the new line
                if (j < boardSizeB / 2) {
                    filling--;
                } else {
                    filling++;
                }
            }

            if (i < boardSizeA / 2) {
                filling = filling - 2;
            }
            // new line of the board output
            System.out.println();
        }
        scanner.close();
        System.exit(0);
    }
}