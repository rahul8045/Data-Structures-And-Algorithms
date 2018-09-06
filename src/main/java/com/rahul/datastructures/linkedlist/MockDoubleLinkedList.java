package com.rahul.datastructures.linkedlist;

public class MockDoubleLinkedList<T> {
    private int size;
    public DoubleLinkedListNode<T> head;

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return (this.head == null && this.size == 0);
    }

    public void add(T data) {
        if(this.head == null) {
            this.head = new DoubleLinkedListNode<T>(data);
        } else {
            DoubleLinkedListNode<T> node = this.head;
            while(node.next != null) {
                node = node.next;
            }
            DoubleLinkedListNode<T> newNode = new DoubleLinkedListNode<T>(data);
            newNode.previous = node.next;
            node.next = newNode;
        }
        this.size++;
    }

    public void insertAt(int idx, T data) {
        if(this.head == null) {
            this.head = new DoubleLinkedListNode<T>(data);
        } else if(idx == 0) {
            DoubleLinkedListNode<T> newNode = new DoubleLinkedListNode<T>(data);
            this.head.previous = newNode;
            newNode.next = this.head;
            this.head = newNode;
        } else {
            DoubleLinkedListNode<T> node = this.head;
            int i=1;
            while(node.next != null && i < idx) {
                node = node.next;
                i++;
            }
            DoubleLinkedListNode<T> newNode = new DoubleLinkedListNode<T>(data);
            newNode.next = node.next;
            if(node.next != null) {
                node.next.previous = newNode;
            }
            newNode.previous = node;
            node.next = newNode;
        }
        this.size++;
    }

    public T remove(T data) {
        if(this.head == null) {
            return null;
        } else if(this.head.data == data) {
            DoubleLinkedListNode<T> removedNode = this.head;
            removedNode.previous = null;
            this.head = removedNode.next;
            this.size--;
            return removedNode.data;
        }

        DoubleLinkedListNode<T> node = this.head;
        while(node.next != null && node.next.data != data) {
            node = node.next;
        }

        if(node.next != null) {
            DoubleLinkedListNode<T> removedNode = node.next;
            node.next = removedNode.next;
            if(node.next != null) {
                node.next.previous = node;
            }
            this.size--;
            return removedNode.data;
        }

        return null;
    }

    public T removeAt(int i) {
        if(this.head == null) {
            return null;
        } else if(i == 0) {
            DoubleLinkedListNode<T> removedNode = this.head;
            removedNode.previous = null;
            this.head = removedNode.next;
            this.size--;
            return removedNode.data;
        }

        int idx = 1;
        DoubleLinkedListNode<T> node = this.head;
        while(node.next != null && idx < i) {
            node = node.next;
            idx++;
        }

        if(node.next != null) {
            DoubleLinkedListNode<T> removedNode = node.next;
            node.next = removedNode.next;
            if(node.next != null) {
                node.next.previous = node;
            }
            this.size -= 1;
            return removedNode.data;
        }

        return null;
    }

    public T get(int i) {
        if(i < 0) return null;
        int idx = 0;
        DoubleLinkedListNode<T> node = this.head;
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
        DoubleLinkedListNode<T> node = this.head;
        while(node != null && node.data != data) {
            node = node.next;
            idx++;
        }
        if(node != null) return idx;
        return -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        if(this.head == null) {
            sb.append("null      : size = "+this.size);
        } else {
            DoubleLinkedListNode<T> node = this.head;
            sb.append("null <- " + node.data);
            node = node.next;
            while(node != null) {
                sb.append(" <-> " + node.data);
                node = node.next;
            }
            sb.append(" -> null");
            sb.append("      : size = "+this.size);
        }

        return sb.toString();
    }
}
