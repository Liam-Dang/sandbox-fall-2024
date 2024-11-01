package com.sandbox.recursion;

public class Factorial {

    private static int count =0;

    public static void main(String[] args) {

            for (int x = 0; x <= 25; x++) {
                System.out.println("factorial(" + x + ") = " + factorial(x));
            }
    }

    public static long factorial(int x) {
        if (x == 0) {
            return 1;
        }

        count++;
        System.out.println("count: " + count);

            return x * factorial(x - 1);
        }
    }

