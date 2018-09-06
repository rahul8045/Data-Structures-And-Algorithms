package com.rahul.datastructures.linkedlist.problems;

import com.rahul.datastructures.linkedlist.MockDoubleLinkedList;
import com.rahul.datastructures.linkedlist.MockLinkedList;
import org.junit.Test;

public class ArrayToLinkedListTest {
    private int[] arr = {1, 2, 3, 4, 5, 6};

    @Test
    public void toLinkedList() {
        ArrayToLinkedList arrayToLinkedList = new ArrayToLinkedList();
        MockLinkedList<Integer> linkedList = arrayToLinkedList.toLinkedList(arr);
        linkedList.insertAt(4, 12);
        System.out.println(linkedList.get(-1));
        System.out.println(linkedList);
    }

    @Test
    public void toDoubleLinkedList() {
        ArrayToLinkedList arrayToLinkedList = new ArrayToLinkedList();
        MockDoubleLinkedList<Integer> linkedList = arrayToLinkedList.toDoubleLinkedList(arr);
        linkedList.insertAt(4, 12);
        System.out.println(linkedList.get(-1));
        System.out.println(linkedList);
    }
}
