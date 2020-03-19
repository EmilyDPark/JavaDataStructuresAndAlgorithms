package com.company;

import java.util.Arrays;

public class PriorityQueue {
    private int[] items = new int[5];
    private int count;

    public void add(int item) {
        if (isFull())
            items = resizeArray(items);

        var i = shiftItemsToInsert(item);
        items[i] = item;
        count++;
    }

    public int shiftItemsToInsert(int item) {
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > item)
                items[i + 1] = items[i];
            else
                break;
        }
        return i + 1;
    }

    private int[] resizeArray(int[] items) {
        int[] newItems = new int[count * 2];
        for (int i = 0; i < count; i++)
            newItems[i] = items[i];
        return newItems;
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[--count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return items.length == count;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

} // PriorityQueue class
