package com.sandbox.sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortingUtilityTest {

    @Test
    void testSelectionSort() {
        Integer[] array = {5, 4, 3, 2, 1};
        SortingUtility.selectionSort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    void testInsertionSort() {
        Integer[] array = {5, 4, 3, 2, 1};
        SortingUtility.insertionSort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    void testBubbleSort() {
        Integer[] array = {5, 4, 3, 2, 1};
        SortingUtility.bubbleSort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    void testQuickSort() {
        Integer[] array = {5, 4, 3, 2, 1};
        SortingUtility.quickSort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    void testMergeSort() {
        Integer[] array = {5, 4, 3, 2, 1};
        SortingUtility.mergeSort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    void testEmptyArray() {
        Integer[] array = {};
        SortingUtility.selectionSort(array);
        assertArrayEquals(new Integer[]{}, array);
    }

    @Test
    void testSingleElementArray() {
        Integer[] array = {1};
        SortingUtility.selectionSort(array);
        assertArrayEquals(new Integer[]{1}, array);
    }

    @Test
    void testAlreadySortedArray() {
        Integer[] array = {1, 2, 3, 4, 5};
        SortingUtility.selectionSort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    void testArrayWithDuplicates() {
        Integer[] array = {3, 1, 2, 3, 1};
        SortingUtility.selectionSort(array);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3}, array);
    }

    @Test
    void testArrayWithNegativeNumbers() {
        Integer[] array = {3, -1, 2, -3, 1};
        SortingUtility.selectionSort(array);
        assertArrayEquals(new Integer[]{-3, -1, 1, 2, 3}, array);
    }
}
