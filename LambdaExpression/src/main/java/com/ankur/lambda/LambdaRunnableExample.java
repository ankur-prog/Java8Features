package com.ankur.lambda;

public class LambdaRunnableExample {
    public static void main(String[] args) {
        //lambda expression is a function without a name
        Runnable runnable = () -> System.out.println("Thread is running");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
