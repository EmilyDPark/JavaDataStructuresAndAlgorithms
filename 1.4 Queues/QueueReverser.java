package com.company;

import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
    // ------------------------------ Exercise ------------------------------
    // 1 - Given an integer K and a queue of integers, write code to reverse the
    //     order of the first K elements of the queue.
    //     Input: Q = [10, 20, 30, 40, 50], K = 3
    //     Output: Q = [30, 20, 10, 40, 50]

    public static void reverse(Queue<Integer> queue, int k) {
        if (k < 0 || k > queue.size())
            throw new IllegalArgumentException();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++)
            stack.push(queue.remove());
        while (!stack.empty())
            queue.add(stack.pop());
        for (int i = 0; i < queue.size() - k; i++)
            queue.add(queue.remove());
    }

} // QueueReverser class
