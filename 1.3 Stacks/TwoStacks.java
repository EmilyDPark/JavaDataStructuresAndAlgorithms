package com.company;

import java.util.Arrays;

public class TwoStacks {
    // ------------------------------ Exercise ------------------------------
    // 1 - Implement two stacks in one array. Support these operations:
    //     push1() // to push in the first stack
    //     push2() // to push in the second stack
    //     pop1()
    //     pop2()
    //     isEmpty1()
    //     isEmpty2()
    //     isFull1()
    //     isFull2()
    //     Make sure your implementation is space efficient.
    //     (hint: do not allocate the same amount of space by dividing the array in half.)

    private int[] items;
    private int top1;
    private int top2;

    public TwoStacks(int capacity) {
        if (capacity <= 0)
            throw new IllegalArgumentException("capacity must be 1 or greater.");

        items = new int[capacity];
        top1 = -1;
        top2 = capacity;
    } // TwoStacks constructor

    public void push1(int item) {
        if (isFull1())
            throw new StackOverflowError();

        items[++top1] = item;
    } // push1 method

    public void push2(int item) {
        if (isFull2())
            throw new StackOverflowError();

        items[--top2] = item;
    } // push2 method

    public int pop1() {
        if (isEmpty1())
            throw new IllegalStateException();

        return items[top1--];
    } // pop1 method

    public int pop2() {
        if (isEmpty2())
            throw new IllegalStateException();

        return items[top2++];
    } // pop2 method

    public boolean isEmpty1() {
        return top1 == -1;
    } // isEmpty1 method

    public boolean isEmpty2() {
        return top2 == items.length;
    } // isEmpty2 method

    public boolean isFull1() {
        return top1 + 1 == top2;
    } // isFull1 method

    public boolean isFull2() {
        return top2 - 1 == top1;
    } // isFull2 method

    public void printStack1() {
        var content = Arrays.copyOfRange(items, 0, top1 + 1);
        System.out.println(Arrays.toString(content));
    } // printStack1 method

    public void printStack2() {
        var content = new int[items.length - top2];
        for (int i = 0, j = items.length - 1; j >= top2; i++, j--)
            content[i] = items[j];
        System.out.println(Arrays.toString(content));
    } // printStack2 method

    @Override
    public String toString() {
        return Arrays.toString(items);
    } // toString method

} // TwoStack class
