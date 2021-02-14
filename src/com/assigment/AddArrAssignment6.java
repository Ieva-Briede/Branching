package com.assigment;

import java.util.Arrays;

public class AddArrAssignment6 {
    public static void main(String[] args) {
        int[][] square = {
                {1, 2, 3, 4},
                {4, 3, 2, 1},
                {7, 8, 9, 6},
                {6, 5, 4, 3}
        };
        String empty = " ";
        System.out.println("Our 2D matrix looks like that: ");
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                System.out.print(square[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("Principal diognal: ");
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                if (square[row] == square[col]) {
                    System.out.print(square[row][col] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("Secondary diognal is: ");
        for (int row = square.length - 1; row >= 0; row--) {
            for (int col = 0; col < square[row].length; col++)
                if (row + col == square.length - 1) {
                    System.out.print(square[row][col] + " ");

                }
        }
        System.out.println();
        System.out.println("New look matrix: ");
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                if (square[row] == square[col] || (row + col == square.length - 1)) {
                    System.out.print(square[row][col] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

    }
}
