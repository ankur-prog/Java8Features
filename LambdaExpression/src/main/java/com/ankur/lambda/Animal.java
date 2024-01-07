package com.ankur.lambda;
/*
Author: Ankur Kushwaha
Date: 7th Jan 2024
Description: This is a simple Interface example
an interface with only one method is called a functional interface
can be annotated with @FunctionalInterface annotation
 */

//Animal is a functional interface
@FunctionalInterface
public interface Animal {
    void eat();
    //Functional interface can have only one abstract method and any number of default methods
    default void run() {
        System.out.println("Animal is running");
    }
    default void sleep() {
        System.out.println("Animal is sleeping");
    }
    //Functional interface can have static methods as well
    static void walk() {
        System.out.println("Animal is walking");
    }
}
