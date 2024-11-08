package com.sandbox.sorting;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {

        Integer[] array = {5, 4, 3, 2, 1};
        SortingUtility.selectionSort(array);

        Arrays.stream(array).forEach(System.out::println);


    }
}
