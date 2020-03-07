package com.company;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        // If the array is full, resize it
        if (items.length == count) {

            // Create a new array (twice the size)
            int[] newItems = new int[count * 2];

            // Copy all the existing items
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            // Set "items" to this new array
            items = newItems;
        }

        // Add the new item at the end
        items[count++] = item;
    } // insert method

    public void removeAt(int index) {
        // Validate the index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        // Shift the items to the left to fill the hole
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;
    } // removeAt method

    public int indexOf(int item) {
        // If we find it, return index
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        // Otherwise, return -1
        return -1;
    } // indexOf method

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    } // print method

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < count - 1; i++)
            System.out.print(items[i] + ", ");
        System.out.print(items[count - 1] + "]");
        System.out.println();
    } // printArray method


    // Exercises

    // Extend the Array class and add a new method to return the largest number.
    public int max() {
        int max = 0;
        for (int i = 1; i < count; i++)
            if (items[max] < items[i])
                max = i;

        return max;
    } // max method

    // Extend the Array class and add a method to return the common items in this array and another array.
    public Array intersect(Array otherArr) {
        // Create a new array
        Array common = new Array(1);

        // for loop goes between both loops to see if there are any matches
        for (int i = 0; i < this.count - 1; i++) {
            for (int j = 0; j < otherArr.count; j++) {
                if (items[i] == otherArr.items[j]) {
                    common.insert(items[i]);
                }
            }
        }
        return common;
    } // intersect method

} // Array class