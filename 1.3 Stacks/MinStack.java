package com.company;

import java.util.Arrays;

public class MinStack {
    // ------------------------------ Exercise ------------------------------
    // 2 - Design a stack that supports push, pop and retrieving the minimum value in constant time.
    //     For example, we populate our stack with [5, 2, 10, 1] (from left to right).
    //     stack.min() // 1
    //     stack.pop()
    //     stack.min() // 2

    private int[] items = new int[5];
    private int count;
    private int[] min = new int[5];
    private int minCount;

    public void push(int item) {
        if (count == items.length)
            throw new StackOverflowError();

        if (count == 0)
            min[0] = item;
        else
            if (item < min[minCount])
                min[++minCount] = item;

        items[count++] = item;
    } // push method

    public int pop() {
        if (count == 0)
            throw new IllegalStateException();

        if (items[count - 1] == min[minCount])
            minCount--;

        return items[--count];
    } // pop method

    public int min() {
        return min[minCount];
    } // min method

    public boolean isEmpty() {
        return count == 0;
    } // isEmpty method

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    } // toString method

} // MinStack class
