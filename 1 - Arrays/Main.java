package com.company;

//import java.util.Arrays;
//import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // ---------------------------------------- Using created Array class ----------------------------------------

        // Create an object of the Array class
        Array numbers = new Array(3);

        // insert method
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);

        // removeAt method
        numbers.removeAt(3);

        // indexOf method
        System.out.println(numbers.indexOf(10));

        // print method
        numbers.print();

        // printArray method
        numbers.printArray();


        // ---------------------------------------- Exercises ----------------------------------------

        // max method
        System.out.println(numbers.max());

        // intersect method
        // Create a new array to compare
        Array newNums = new Array(5);
        newNums.insert(10);
        newNums.insert(20);
        newNums.insert(40);
        newNums.insert(50);
        newNums.insert(60);
        System.out.println("\nnewNums");
        newNums.printArray();

        numbers.intersect(newNums).printArray();

        // reverse method
        numbers.reverse();
        numbers.printArray();

        Array nullArr = new Array(0);
        nullArr.reverse();
        nullArr.printArray();

        // insertAt method
        numbers.insertAt(15, 4);
        numbers.printArray();



//        // ---------------------------------------- Using java.util.Arrays ----------------------------------------
//        // Declare an array
//        int[] numberArr = new int[3];
//        // Initialize the array
//        numberArr[0] = 10;
//        numberArr[1] = 20;
//        numberArr[2] = 30;
//
//        // Declare and initialize an array
//        int[] numbers = { 10, 20, 30 };
//
//        // Print an array
//        //System.out.println(numbers); // This prints the address of the array in memory
//        System.out.println(Arrays.toString(numbers)); // Convert the array to string and print
//
//        System.out.println(numbers.length);



//        // ---------------------------------------- Using java.util.ArrayList ----------------------------------------
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.remove(0);
//        System.out.println(list.indexOf(20));
//        System.out.println(list.lastIndexOf(30));
//        System.out.println(list.contains(10));
//        System.out.println(list.size());
//        list.toArray();
//        System.out.println(list);

    } // main method

} // Main class
