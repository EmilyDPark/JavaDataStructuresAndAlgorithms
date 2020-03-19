package com.company;

import java.util.ArrayDeque;
//import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // -------------------- Using Queues with ArrayDeque --------------------
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);

        var front = queue.remove();
        System.out.println(queue);


        // -------------------- Exercise: Reversing a Queue --------------------
        reverse(queue);
        System.out.println(queue);


        // -------------------- Exercise: Building a Queue using an Array --------------------
        ArrayQueue aQueue = new ArrayQueue(5);
        aQueue.enqueue(10);
        aQueue.enqueue(20);
        aQueue.enqueue(30);
        System.out.println(aQueue);

        aQueue.dequeue();
        var aFront = aQueue.dequeue();
        System.out.println(front);
        System.out.println(aQueue);

        aQueue.enqueue(40);
        aQueue.enqueue(50);
        aQueue.enqueue(60);
        aQueue.enqueue(70);
        aQueue.dequeue();
        aQueue.enqueue(80);
        System.out.println(aQueue);

        System.out.println(aQueue.peek());
        System.out.println(aQueue);


        // -------------------- Exercise: Building a Queue using Two Stacks --------------------
        QueueWithTwoStacks sQueue = new QueueWithTwoStacks();
        sQueue.enqueue(10);
        sQueue.enqueue(20);
        sQueue.enqueue(30);
        var sFront = sQueue.dequeue();
        System.out.println(sFront);


        // -------------------- Using a Priority Queue --------------------
//        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
//        pQueue.add(5);
//        pQueue.add(1);
//        pQueue.add(3);
//        pQueue.add(2);
//        while (!pQueue.isEmpty())
//            System.out.println(pQueue.remove());


        // -------------------- Exercise: Create a Priority Queue with an Array --------------------
        PriorityQueue prQueue = new PriorityQueue();
        prQueue.add(5);
        prQueue.add(3);
        prQueue.add(6);
        prQueue.add(1);
        prQueue.add(4);
        System.out.println(prQueue);

        while (!prQueue.isEmpty())
            System.out.println(prQueue.remove());


        // -------------------- Exercise: Reverse K Elements of a Queue --------------------
        Queue<Integer> reQueue = new ArrayDeque<>();
        reQueue.add(10);
        reQueue.add(20);

        reQueue.add(30);
        reQueue.add(40);
        reQueue.add(50);
        QueueReverser.reverse(reQueue, 3);
        System.out.println(reQueue);


        // -------------------- Exercise: Build a Queue with a Linked List from Scratch --------------------
        LinkedListQueue lQueue = new LinkedListQueue();
        lQueue.enqueue(10);
        lQueue.enqueue(20);
        lQueue.enqueue(30);
        lQueue.enqueue(40);
        lQueue.enqueue(50);
        System.out.println(lQueue);
        lQueue.dequeue();
        System.out.println(lQueue.dequeue());
        System.out.println(lQueue.peek());
        System.out.println(lQueue);
        System.out.println(lQueue.size());


        // -------------------- Exercise: Build a Queue with a Linked List from Scratch --------------------
        StackWithTwoQueues qStack = new StackWithTwoQueues();
        qStack.push(10);
        qStack.push(20);
        qStack.push(30);
        qStack.push(40);
        qStack.push(50);
        System.out.println(qStack);
        qStack.pop();
        System.out.println(qStack.pop());
        System.out.println(qStack.peek());
        System.out.println(qStack);
        System.out.println(qStack.size());

    } // main method

    // -------------------- Exercise: Reversing a Queue --------------------
    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
            queue.add(stack.pop());
    } // reverse method

} // Main class
