package com.company;

public class CountingSort {
    public void sort(int[] array) {
        int[] counts = new int[max(array) + 1];

        for (var num : array)
            counts[num]++;

        var k = 0;
        for (var i = 0; i < counts.length; i++)
            for (var j = 0; j < counts[i]; j++)
                array[k++] = i;
    }

    public int max(int[] array) {
        var max = 0;
        for (int num : array) {
            if (num > max)
                max = num;
        }
        return max;
    }
}
