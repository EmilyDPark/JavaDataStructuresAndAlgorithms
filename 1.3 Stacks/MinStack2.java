package com.company;

public class MinStack2 {
    // ------------------------------ Exercise ------------------------------
    // 2 - Design a stack that supports push, pop and retrieving the minimum value in constant time.
    //     For example, we populate our stack with [5, 2, 10, 1] (from left to right).
    //     stack.min() // 1
    //     stack.pop()
    //     stack.min() // 2

    private Stack stack = new Stack();
    private Stack minStack = new Stack();

    public void push(int item) {
        stack.push(item);

        if (minStack.isEmpty())
            minStack.push(item);
        else if (item < minStack.peek())
            minStack.push(item);
    } // push method

    public int pop() {
        if (stack.isEmpty())
            throw new IllegalStateException();

        var top = stack.pop();

        if (minStack.peek() == top)
            minStack.pop();

        return top;
    } // pop method

    public int min() {
        return minStack.peek();
    } // min method

} // MinStack2 class
