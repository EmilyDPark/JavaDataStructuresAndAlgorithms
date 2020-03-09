package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // -------------------- Bubble Sort --------------------
	    int[] bubbleNumbers = { 7, 3, 1, 4, 6, 2, 3 };
	    var bubbleSorter = new BubbleSort();
	    bubbleSorter.sort(bubbleNumbers);
        System.out.println(Arrays.toString(bubbleNumbers));

        // -------------------- Selection Sort --------------------
        int[] selectionNumbers = { 7, 3, 1, 4, 6, 2, 3 };
        var selectionSorter = new SelectionSort();
        selectionSorter.sort(selectionNumbers);
        System.out.println(Arrays.toString(selectionNumbers));

        // -------------------- Insertion Sort --------------------
        int[] insertionNumbers = { 7, 3, 1, 4, 6, 2, 3 };
        var insertionSorter = new InsertionSort();
        insertionSorter.sort(insertionNumbers);
        System.out.println(Arrays.toString(insertionNumbers));

        // -------------------- Merge Sort --------------------
        int[] mergeNumbers = { 7, 3, 1, 4, 6, 2, 3 };
        var mergeSorter = new MergeSort();
        mergeSorter.sort(mergeNumbers);
        System.out.println(Arrays.toString(mergeNumbers));

        // -------------------- Quick Sort --------------------
        int[] quickNumbers = { 7, 3, 1, 4, 6, 2, 3 };
        var quickSorter = new QuickSort();
        quickSorter.sort(quickNumbers);
        System.out.println(Arrays.toString(quickNumbers));

        // -------------------- Counting Sort --------------------
        int[] countingNumbers = { 7, 3, 1, 4, 6, 2, 3 };
        var countingSorter = new CountingSort();
        countingSorter.sort(countingNumbers);
        System.out.println(Arrays.toString(countingNumbers));

    }
}
