package com.rahul.datastructures.arrays.twodimentional;

import java.util.Random;

public class Matrix {
    public static void printMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int m = 2, n=4, k=3;
        int[][] matrix1 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] matrix2 = new int[m][n];
        Random rand = new Random();
        for(int i=0; i<matrix2.length; i++) {
            for(int j=0; j< matrix2[0].length; j++) {
                matrix2[i][j] = (Math.abs(rand.nextInt()%k));
            }
        }
        printMatrix(matrix1);
        printMatrix(matrix2);
        int[][] multipliedMatrix = multiplyMatrices(matrix1, matrix2);
        printMatrix(multipliedMatrix);
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for(int i=0; i<matrix1.length; i++) {
            for(int j=0; j<matrix2[0].length; j++) {
                for(int k=0; k<matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
}
