package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Create a new linked list
        var list = new LinkedList();

        // addFirst method
        list.addFirst(20);
        list.addFirst(10);
        list.printList();

        // addLast method
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.printList();

        // indexOf method
        System.out.println(list.indexOf(30));

        // contains method
        System.out.println(list.contains(40));

        // removeFirst method
        list.removeFirst();
        list.printList();

        // removeLast method
        list.removeLast();
        list.printList();

        // size method
        System.out.println(list.size());

        // toArray method;
        var array = list.toArray();
        System.out.println(Arrays.toString(array));

        // reverse method
        list.reverse();
        list.printList();

        // getKthFromTheEnd method
        System.out.println(list.getKthFromTheEnd(1));


        // ---------------------------------------- Exercises ----------------------------------------

        // printMiddle method
        list.printMiddle();

        // hasLoop method
        var list2 = LinkedList.createWithLoop();
        System.out.println(list2.hasLoop());

    }  // main method

} // Main class
