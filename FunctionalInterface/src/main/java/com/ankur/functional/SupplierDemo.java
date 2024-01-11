package com.ankur.functional;
import java.util.function.Supplier;

/*
Created by ankur on 11/01/2024

 */
/**
 what is supplier interface ? it supplies the value . it does not accept any argument .
 it has one abstract method get() .
 it has one static method identity() .
 it is a functional interface .
 it is present in java.util.function package .
 it is used when we want to return some value .
 complex use case of supplier interface is to return random numbers .
 we can use it to return current date and time .
 we can use it to return any object .
 we can use it to return any collection .
 we can use it to return any type of value .
 we can use it to return any type of object .
 */
public class SupplierDemo {

    public static void main(String[] args) {



        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

        Supplier<Integer> supplier1 = () -> 10;
        System.out.println(supplier1.get());

        Supplier<Double> supplier2 = () -> 10.5;
        System.out.println(supplier2.get());

        Supplier<String> supplier3 = () -> {
            String[] names = {"Ankur", "Aman", "Amit", "Rahul", "Rajesh"};
            int x = (int) (Math.random() * 4);
            return names[x];
        };
        System.out.println(supplier3.get());

        Supplier<String> otpSupplier = () -> {
            String otp = "";
            for (int i = 0; i < 6; i++) {
                otp = otp + (int) (Math.random() * 10);
            }
            return otp;
        };
        System.out.println(otpSupplier.get());

        Supplier<String> passwordSupplier = () -> {
            String pwd = "";
            String alphaNumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            for (int i = 0; i < 8; i++) {
                pwd = pwd + alphaNumeric.charAt((int) (Math.random() * 62));
            }
            return pwd;
        };
        System.out.println(passwordSupplier.get());

        Supplier<String> supplier6 = () -> {
            String[] names = {"Ankur", "Aman", "Amit", "Rahul", "Rajesh"};
            int x = (int) (Math.random() * 4);
            return names[x];
        };
        System.out.println(supplier6.get());

        Supplier<String> supplier7 = () -> {
            String[] names = {"Ankur", "Aman", "Amit", "Rahul", "Rajesh"};
            int x = (int) (Math.random() * 4);
            return names[x];
        };
        System.out.println(supplier7.get());

        Supplier<String> supplier8 = () -> {
            String[] names = {"Ankur", "Aman", "Amit", "Rahul", "Rajesh"};
            int x = (int) (Math.random() * 4);
            return names[x];
        };
        System.out.println(supplier8.get());
}
}