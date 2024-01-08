package com.ankur.functional;

/*
@author Ankur
Created 08/01/2024 - 11:44 PM
    * Functional Interface is an interface with only one abstract method
    * Functional Interface can have any number of default and static methods
    * Functional Interface can be annotated with @FunctionalInterface annotation
    * @FunctionalInterface annotation is a facility to avoid accidental addition of abstract methods in the functional interfaces
    * @FunctionalInterface annotation can be used to mark an interface as functional interface
    * @FunctionalInterface annotation is a compiler level annotation
    * @FunctionalInterface annotation is not mandatory to mark an interface as Functional Interface
    * @FunctionalInterface annotation is a informative annotation
    * @FunctionalInterface annotation is introduced in Java 8
    * @FunctionalInterface annotation is a part of java.lang package
    * @FunctionalInterface annotation is retained at runtime
    * @FunctionalInterface annotation is used to ensure that the functional interface can’t have more than one abstract method

 */
@FunctionalInterface
public interface MyFunctionalInterface {
    void myMethod();
    static void myStaticMethod() {
        System.out.println("I am a static method");
    }
    default void myDefaultMethod() {
        System.out.println("I am a default method");
    }

}
