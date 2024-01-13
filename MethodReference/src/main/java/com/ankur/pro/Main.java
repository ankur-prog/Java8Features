package com.ankur.pro;

import java.util.function.BiFunction;

/**
 * Created by ankur on 11/01/2024
 * <p>
 * what is method reference ? it is used to refer method of functional interface .
 *
 */
public class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // method reference to static method
        BiFunction<Integer, Integer, Integer> biFunction = Main::add;
        System.out.println(biFunction.apply(10, 20));



        }
    }
