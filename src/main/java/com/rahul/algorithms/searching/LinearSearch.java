package com.rahul.algorithms.searching;

public class LinearSearch implements SearchIf {
    @Override
    public int search(int[] arr, int x) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == x) return i;
        }
        return -1;
    }

    @Override
    public int[] search(int[][] matrix, int x) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == x) return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }
}
