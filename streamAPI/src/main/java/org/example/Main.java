package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
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
 *  Map, Filter, Reduce
 *  Map: map is used to transform each element in a stream
 *  Filter: filter is used to filter elements in a stream
 *  Reduce: reduce is used to reduce elements in a stream
 *  Map returns a stream of transformed elements of the original stream and the size of the transformed stream is same as the size of the original stream.
 *  Filter returns a stream of filtered elements of the original stream and the size of the filtered stream is less than or equal to the size of the original stream.
 *  Reduce returns a single element of the original stream.
 *  Parrallel Stream: A stream which is processed in parallel is called a parallel stream. A parallel stream is created from a sequential stream.
 *  Lazy Stream: A stream which is processed lazily is called a lazy stream. A lazy stream is created from a sequential stream.
 *  Sequential Stream: A stream which is processed sequentially is called a sequential stream.
 *  Functional Stream: A stream which is processed in a functional way is called a functional stream.
 *

 */


public class Main {
    public static void main(String[] args) {

        // print numbers from 1 to 10
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        num.forEach((n) -> System.out.println(n));
        Stream<Integer> stream = num.stream();
        // print each number in the stream
        System.out.println("print each number in the stream");
        stream.forEach((n) -> System.out.println(n));
        // stream can be used only once so we need to create a new stream. If we try to use the same stream again we will get an exception.
        //stream.forEach((n) -> System.out.println(n));
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



        // print the sum of squares of all even numbers in the stream
        System.out.println("print the sum of squares of all even numbers in the stream");
        System.out.println(num.stream().filter((n) -> n % 2 == 0).map((n) -> n * n).mapToInt((n) -> n).sum());
        // print the sum of squares of all odd numbers in the stream
        System.out.println("print the sum of squares of all odd numbers in the stream");
        System.out.println(num.stream().filter((n) -> n % 2 != 0).map((n) -> n * n).mapToInt((n) -> n).sum());

        // print the sum of squares of all even numbers in the stream which are greater than 5
        System.out.println("print the sum of squares of all even numbers in the stream which are greater than 5");
        System.out.println(num.stream().filter((n) -> n % 2 == 0).filter((n) -> n > 5).map((n) -> n * n).mapToInt((n) -> n).sum());
        // Create a student class and play around with stream API
        // print the name of all students
        System.out.println("print the name of all students");
        List<Student> students = Arrays.asList(new Student("Raj", 20), new Student("Rahul", 21), new Student("Ramesh", 22));
        students.stream().map((s) -> s.getName()).forEach((s) -> System.out.println(s));
        // print the name of all students whose age is greater than 20
        System.out.println("print the name of all students whose age is greater than 20");
        students.stream().filter((s) -> s.getAge() > 20).map((s) -> s.getName()).forEach((s) -> System.out.println(s));
        // print the name of all students whose age is greater than 20 and whose name starts with R
        System.out.println("print the name of all students whose age is greater than 20 and whose name starts with R");
        students.stream().filter((s) -> s.getAge() > 20).filter((s) -> s.getName().startsWith("R")).map((s) -> s.getName()).forEach((s) -> System.out.println(s));
        // print the name of all students whose age is greater than 20 and whose name starts with R and print the name in uppercase
        System.out.println("print the name of all students whose age is greater than 20 and whose name starts with R and print the name in uppercase");
        students.stream().filter((s) -> s.getAge() > 20).filter((s) -> s.getName().startsWith("R")).map((s) -> s.getName().toUpperCase()).forEach((s) -> System.out.println(s));
        // print the name of all students whose age is greater than 20 and whose name starts with R and print the name in uppercase and sort the names
        System.out.println("print the name of all students whose age is greater than 20 and whose name starts with R and print the name in uppercase and sort the names");
        students.stream().filter((s) -> s.getAge() > 20).filter((s) -> s.getName().startsWith("R")).map((s) -> s.getName().toUpperCase()).sorted().forEach((s) -> System.out.println(s));
        // print the name of all students whose age is greater than 20 and whose name starts with R and print the name in uppercase and sort the names and print the names in reverse order
        System.out.println("print the name of all students whose age is greater than 20 and whose name starts with R and print the name in uppercase and sort the names and print the names in reverse order");
        students.stream().filter((s) -> s.getAge() > 20).filter((s) -> s.getName().startsWith("R")).map((s) -> s.getName().toUpperCase()).sorted((s1, s2) -> s2.compareTo(s1)).forEach((s) -> System.out.println(s));

        // what is predicate in java
        // Predicate is a functional interface in java.util.function package which has a single method called test which takes an argument and returns a boolean value.
        Predicate<Student> ageGreaterThan20 = (s) -> s.getAge() > 20;
        System.out.println("print the name of all students whose age is greater than 20");
        System.out.println(ageGreaterThan20.test(new Student("Raj", 20)));

        Predicate<Student> nameStartsWithR = (s) -> s.getName().startsWith("R");
        Predicate<Student> ageGreaterThan20AndNameStartsWithR = ageGreaterThan20.and(nameStartsWithR);
        
        }

    }
