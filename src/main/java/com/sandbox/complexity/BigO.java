package com.sandbox.complexity;

public class BigO {

    public static void main(String[] args) {

        // O(n)
        // O(n) * O(n) = O(n^2)
        int n = 100;
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("i = " + i + " j = " + j);
            }
            System.out.println("i = " + i);
        }

        // O(n)

        // O(n)

        // O(log n)

        // O(n) + O(n) + O(log n)= O(n) + O(n) = O(n)



    }
}
