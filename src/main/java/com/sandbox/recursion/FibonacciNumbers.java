package com.sandbox.recursion;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumbers {

    private Map<Integer, Long> dictionary = new HashMap<>();

    public static void main(String[] args) {

            FibonacciNumbers fn = new FibonacciNumbers();

            for (int n = 0; n <= 92; n++) {
                System.out.println("fib(" + n + ") = " + (fn.fib(n)));
            }
    }

    // O(2^n) amortized to O(1) using memoization
    public long fib(int x) {

        // f0 = 0
        if (x == 0) {
            return 0L;
        }

        // f1 = 1
        if (x == 1) {
            return 1L;
        }

        // fn = fn-1 + fn-2
        return memo(x - 1) + memo(x - 2);
    }

    // O(n)
    public long memo(int m) {

        Long value = dictionary.get(m);

        if (value != null) {
            return value;
        }

        value = fib(m);
        dictionary.put(Integer.valueOf(m), value);
        return value;
    }

}
