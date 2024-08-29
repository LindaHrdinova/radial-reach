package com.github.LindaHrdinova;

import java.util.Scanner;

public class RadialReach {
    private static int inputCheck(Scanner scanner, String prompt) {
        System.out.println(prompt);
        int input = scanner.nextInt();
        if (input % 2 == 0 || input <= 1) {
            System.err.println("This is not an odd number bigger than 1.");
            System.exit(1);
        }
        return input;
    }

    public static void main(String[] args) {
        // loading board size
        Scanner scanner = new Scanner(System.in);
        int boardHeight = inputCheck(scanner, "Enter an odd number bigger than 1, height:");
        int boardWidth = inputCheck(scanner, "Enter an odd number bigger than 1, width:");

        System.out.println("The size is: " + boardHeight + " x " + boardWidth);

        int midRow = (boardHeight - 1) / 2;
        int midColumn = (boardWidth - 1) / 2;

        int[][] board = new int[boardHeight][boardWidth];

        for (int i = 0; i < boardHeight; i++) {
            for (int j = 0; j < boardWidth; j++) {

                int rowDifference = Math.abs(midRow - i);
                int columnDifference = Math.abs(midColumn - j);
                int distance = rowDifference + columnDifference;

                board[i][j] = distance;
                System.out.print(board[i][j] + "\t");
            }
            // new line of the board output
            System.out.println();
        }
        scanner.close();
    }
}