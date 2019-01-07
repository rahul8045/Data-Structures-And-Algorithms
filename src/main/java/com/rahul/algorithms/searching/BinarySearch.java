package com.rahul.algorithms.searching;

public class BinarySearch implements SearchIf {

    @Override
    public int search(int[] arr, int x) {
        return binarySearchRecursive(arr, 0, arr.length-1, x);
    }

    // iterative
    private int binarySearch(int[] arr, int low, int high, int x) {
        while(low < high) {
            int mid = (high-1+low)/2;
            if(arr[mid] == x) return mid;
            else if(arr[mid] > x) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return -1;
    }

    // recursive
    private int binarySearchRecursive(int[] arr, int low, int high, int x) {
        if(low >= high) return -1;

        int mid = (high+low)/2;
        if(arr[mid] == x) return mid;
        else if(arr[mid] > x) return binarySearchRecursive(arr, low, mid-1, x);
        else return binarySearchRecursive(arr, mid+1, high, x);
    }

    @Override
    public int[] search(int[][] matrix, int x) {
        int i = matrix.length-1;
        int j = 0;

        while(i>=0 && j<=matrix[0].length-1) {
            if(matrix[i][j] == x) return new int[]{i, j};
            else if(matrix[i][j] > x) i--;
            else j++;
        }
        return new int[]{-1, -1};
    }
}
