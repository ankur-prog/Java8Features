package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream API
 * 1. Stream API is a new feature in Java 8
 * 2. Stream API is used to process a collection of objects
 * 3. Stream API is used to process data in a declarative way
 * 4. Stream API is used to process data in a functional programming way
 * 5. Stream API is used to process data in a pipeline
 * 6. Stream API is used to process data in a parallel way
 * 7. Stream API is used to process data in a lazy way
 * 8. Stream API is used to process data in a sequential way
 * 9. Stream API is used to process data in a functional way
 *
 *
 *
 */


public class Main {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        num.forEach((n) -> System.out.println(n));
        Stream<Integer> stream = num.stream();
        // print each number in the stream
        System.out.println("print each number in the stream");
        stream.forEach((n) -> System.out.println(n));
        // print the sum of all numbers in the stream
        System.out.println( "print the sum of all numbers in the stream");
        System.out.println(num.stream().mapToInt((n) -> n).sum());
        // print the sum of all even numbers in the stream
        System.out.println("print the sum of all even numbers in the stream");
        System.out.println(num.stream().filter((n) -> n % 2 == 0).mapToInt((n) -> n).sum());
        // print the sum of all odd numbers in the stream
        System.out.println("print the sum of all odd numbers in the stream");
        System.out.println(num.stream().filter((n) -> n % 2 != 0).mapToInt((n) -> n).sum());
        // print square of each number in the stream
        System.out.println("print square of each number in the stream");
        num.stream().map((n) -> n * n).forEach((n) -> System.out.println(n));
        System.out.println("print square of each number in the stream");
        // print the sum of squares of all numbers in the stream
        System.out.println(num.stream().map((n) -> n * n).mapToInt((n) -> n).sum());
        }
    }
