package com.ankur.functional;

public class FunctionalMain {
    public static void main(String[] args) {
        //lambda expression is a function without a name
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("I am a functional interface");
       //calling the method of functional interface
        myFunctionalInterface.myMethod();
        //calling the static method of functional interface
        MyFunctionalInterface.myStaticMethod();
        //calling the default method of functional interface
        myFunctionalInterface.myDefaultMethod();

    }
}
