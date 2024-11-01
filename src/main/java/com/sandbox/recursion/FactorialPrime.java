package com.sandbox.recursion;

import java.util.*;

public class FactorialPrime {

    public static void main(String[] args) {

        List<Long>  minus = new ArrayList<>();
        List<Long>  plus = new ArrayList<>();

        for (int x = 0; x <= 20; x++) {

            long f = factorial(x);
            if (isPrime(f-1)) {
                minus.add(f - 1);
                System.out.println("factorial(" + x + ") - 1 = " + (f - 1));
            }
        }

        for (int x = 0; x <= 20; x++) {

            long f = factorial(x);
            if (isPrime(f+1)) {
                plus.add(f + 1);
                System.out.println("factorial(" + x + ") + 1 = " + (f + 1));
            }
        }

        System.out.println("Minus Series: " + minus);
        System.out.println("Plus Series: " + plus);

    }

    public static long factorial(int x) {
        if (x == 0) {
            return 1;
        }

        return x * factorial(x - 1);
    }

    /*public static boolean isPrime(long n) {

        boolean prime = true;

        if (n == 0 || n == 1) {
            prime = false;
        } else {
            double m = Math.ceil(Math.sqrt(n));
            for (int x = 2; x <= m; x++) {
                if (n % x == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return  prime;
    }*/

    public static boolean isPrime(long n) {
        return isPrimeHelper(n, 2);
    }

    private static boolean isPrimeHelper(long n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if (divisor > Math.sqrt(n)) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }

        return isPrimeHelper(n, divisor + 1);
    }

}
