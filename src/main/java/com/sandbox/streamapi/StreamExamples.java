package com.sandbox.streamapi;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;
import java.util.stream.*;

import static java.util.Locale.filter;

public class StreamExamples {

    public static void main(String[] args) {

        // test data
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5);
        List<String> names = Arrays.asList("Reflection", "Collection", "stream", "Stream", "Java");
        IntPredicate evenOnly = x -> x % 2 == 0;
        Predicate<Integer> evenOnlyPredicate = x -> x % 2 == 0;

        // intermediate operations
        // map
        List<Integer> square = numbers
                .stream()
                .map(x -> x * x) // monad
                .collect(Collectors.toList());
        square.forEach(System.out::println);

        // filter
        List<String> result = names
                .stream()
                .filter(s -> s.toLowerCase().startsWith("s"))
                .collect(Collectors.toList());
        result.forEach(System.out::println);

        //sorted
        List<String> result2 = names
                .stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
        result2.forEach(System.out::println);

        // terminal operations
        // collect
        Set<Integer> squared = numbers
                .stream()
                .map(x -> x * x)
                .collect(Collectors.toSet());
        squared.forEach(System.out::println);

        // forEach
        numbers
                .stream()
                .map(x -> x * 2)
                .forEach(System.out::println);
        numbers.forEach(System.out::println);

        for(Integer i : numbers) {
            System.out.println(i);
        }

        // reduce
        int sum = 0;
        for(int x = 1; x <= 5; x++) {
            if (x % 2 == 0) {
                sum += x;
            }
        }
        System.out.println("Even sum: " + sum);

        int evenSum = numbers
                .stream()
                .filter(evenOnlyPredicate)
                .reduce(0, (acc, x) -> acc + x);
        System.out.println("Even sum: " + evenSum);

        int totalSum = IntStream.iterate(0, x -> x + 1)
                .skip(5)
                .limit(5)
                .filter(evenOnly)
                .reduce(2, Integer::sum);
        System.out.println("Total sum: " + totalSum);

        // random ints
        Random random = new Random();
        random.ints(1, 11)
                .limit(50)
                .forEach(System.out::println);
        //IntStream generate
        final AtomicInteger counter = new AtomicInteger(1);
        IntStream.generate(counter::getAndIncrement)
                .filter(evenOnly)
                .limit(5)
                .forEach(System.out::println);



        // stream of random strings
        String randomString = Stream.generate(new StringGenerator())
                .limit(16)
                .collect(Collectors.joining());
        System.out.println(randomString);
    }

}
