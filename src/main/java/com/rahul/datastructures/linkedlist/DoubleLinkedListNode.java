package com.rahul.datastructures.linkedlist;

public class DoubleLinkedListNode<T> {
    public T data;
    public DoubleLinkedListNode<T> previous;
    public DoubleLinkedListNode<T> next;

    public DoubleLinkedListNode() {
    }

    public DoubleLinkedListNode(T data) {
        this.data = data;
    }
}
