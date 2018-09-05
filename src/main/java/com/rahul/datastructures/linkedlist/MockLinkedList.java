package com.rahul.datastructures.linkedlist;

public class MockLinkedList<T> {
    private int size;
    public LinkedListNode<T> head;

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return (this.head == null && this.size == 0);
    }

    public void add(T data) {
        if(this.head == null) {
            this.head = new LinkedListNode<T>(data);
            this.size++;
        } else {
            LinkedListNode<T> node = this.head;
            while(node.next != null) {
                node = node.next;
            }
            node.next = new LinkedListNode<T>(data);
            this.size++;
        }
    }

    public T remove(T data) {
        if(this.head == null) {
            return null;
        } else if(this.head.data == data) {
            LinkedListNode<T> removedNode = this.head;
            this.head = removedNode.next;
            this.size--;
            return removedNode.data;
        }

        LinkedListNode<T> node = this.head;
        while(node.next != null && node.next.data != data) {
            node = node.next;
        }

        if(node.next != null) {
            LinkedListNode<T> removedNode = node.next;
            node.next = removedNode.next;
            this.size--;
            return removedNode.data;
        }

        return null;
    }

    public T removeAt(int i) {
        if(this.head == null) {
            return null;
        } else if(i == 0) {
            LinkedListNode<T> removedNode = this.head;
            this.head = removedNode.next;
            this.size--;
            return removedNode.data;
        }
        int idx = 1;
        LinkedListNode<T> node = this.head;
        while(node.next != null && idx < i) {
            node = node.next;
            idx ++;
        }

        if(node.next != null) {
            LinkedListNode<T> removedNode = node.next;
            node.next = removedNode.next;
            this.size--;
            return removedNode.data;
        }

        return null;
    }

    public T get(int i) {
        if(i < 0) return null;
        int idx = 0;
        LinkedListNode<T> node = this.head;
        while(node != null && idx < i) {
            node = node.next;
            idx++;
        }
        if(node != null) {
            return node.data;
        }
        return null;
    }

    public int indexOf(T data) {
        int idx = 0;
        LinkedListNode<T> node = this.head;
        while(node != null && node.data != data) {
            node = node.next;
            idx++;
        }
        if(node != null) return idx;
        return -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        LinkedListNode<T> node = this.head;
        while(node != null) {
            sb.append(node.data + " -> ");
            node = node.next;
        }
        sb.append("null");
        sb.append("      : size = "+this.size);
        return sb.toString();
    }
}
