package com.rahul.algorithms.searching;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

@RunWith(JUnit4.class)
public class SearchIfTest {
    private int[] arr = {5, 9, 2, 8, 1, 0, 3, 2, 7, 6};
    private int[][] matrix = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};

    @Test
    public void search() {
        SearchIf searchIf = new LinearSearch();
        System.out.println(searchIf.search(arr, 1));
        int[] result = searchIf.search(matrix, 0);
        System.out.println(result[0]+" "+result[1]);
    }

    @Test
    public void search1() {
        SearchIf searchIf = new BinarySearch();
        Arrays.sort(arr);
        Arrays.sort(matrix, (a, b) -> Integer.compare(a[0], b[0]));

        System.out.println(searchIf.search(arr, 1));
        int[] result = searchIf.search(matrix, 5);
        System.out.println(result[0]+" "+result[1]);
    }

    @Test
    public void search2() {
    }

    @Test
    public void search3() {
    }
}
