package com.company;

import java.util.ArrayDeque;

public class StackWithTwoQueues {
    // ------------------------------ Exercise ------------------------------
    // 2 - Build a stack using two queues.
    //     Implement the following operations and calculate their runtime complexities.
    //      - push
    //      - pop
    //      - peek
    //      - size
    //      - isEmpty

    private ArrayDeque<Integer> queue1 = new ArrayDeque<>();
    private ArrayDeque<Integer> queue2 = new ArrayDeque<>();
    private int top;

    public void push(int item) {
        queue1.add(item);
        top = item;
    }

    public int pop() {
        if (isEmpty())
            throw new IllegalStateException();

        while (queue1.size() > 1) {
            top = queue1.remove();
            queue2.add(top);
        }

        swapQueues();
        return queue2.remove();
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return top;
    }

    public int size() {
        return queue1.size();
    }

    private void swapQueues() {
        var temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    @Override
    public String toString() {
        return queue1.toString();
    }

} // StackWithTwoQueues class
