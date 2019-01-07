package com.rahul.datastructures.heap;

public class Heap {
    private static final Integer MAX_CAPACITY = Integer.MAX_VALUE-8;
    private static final Integer DEFAULT_CAPACITY = 1;
    private Integer currCapacity;
    private int size;
    private Object[] elements;

    public Heap(int capacity) {
        this.elements = new Object[capacity];
        this.currCapacity = capacity;
        this.size=0;
    }

    public Heap() {
        this(DEFAULT_CAPACITY);
    }

    public void add(Object element) throws Exception {
        if(doesCapacityExceed()) {
            doCapacityPlanning();
        }
        this.elements[size] = element;
        this.size++;
    }

    private boolean doesCapacityExceed() {
        return (this.size+1) > this.currCapacity;
    }

    private void doCapacityPlanning() throws Exception {
        int prevCapacity = this.currCapacity;
        if(prevCapacity == MAX_CAPACITY) {
            throw new Exception("Elements exceeded maximum capacity");
        } else if(this.currCapacity * 2 > MAX_CAPACITY) {
            this.currCapacity = MAX_CAPACITY;
        } else {
            this.currCapacity *= 2;
        }

        Object[] temp = new Object[this.currCapacity];
        for(int i=0; i< prevCapacity; i++) {
            temp[i] = this.elements[i];
        }
        this.elements = temp;
    }
}
