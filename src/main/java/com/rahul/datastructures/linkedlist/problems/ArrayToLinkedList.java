package com.rahul.datastructures.linkedlist.problems;

import com.rahul.datastructures.linkedlist.MockDoubleLinkedList;
import com.rahul.datastructures.linkedlist.MockLinkedList;

public class ArrayToLinkedList {
    public MockLinkedList<Integer> toLinkedList(int[] arr) {
        MockLinkedList<Integer> linkedList = new MockLinkedList<Integer>();
        for(int i=0; i<arr.length; i++) {
            linkedList.add(arr[i]);
        }
        return linkedList;
    }

    public MockDoubleLinkedList<Integer> toDoubleLinkedList(int[] arr) {
        MockDoubleLinkedList<Integer> linkedList = new MockDoubleLinkedList<Integer>();
        for(int i=0; i<arr.length; i++) {
            linkedList.add(arr[i]);
        }
        return linkedList;
    }
}
