package com.ankur.functional;


import java.util.function.Consumer;
/**
 what is consumer interface ? it accepts one argument and returns nothing (void) .
 it has one abstract method accept(T t) .
 it has one default method andThen(Consumer<? super T> after) .
 it has one static method identity() .
 it is a functional interface .
 it is present in java.util.function package .
 it is used when we want to do some operation on the argument and don't want to return anything .
*/
public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hello World");

        Consumer<Integer> consumer1 = i -> System.out.println(i*i);
        consumer1.accept(10);

        Consumer<String> consumer2 = s -> System.out.println(s.toLowerCase());
        consumer2.accept("HELLO WORLD");

        Consumer<String> consumer3 = s -> System.out.println(s.toUpperCase());
        consumer2.andThen(consumer3).accept("Hello World");



    }
}
