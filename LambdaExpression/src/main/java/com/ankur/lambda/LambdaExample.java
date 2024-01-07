package com.ankur.lambda;
/*
Author: Ankur Kushwaha
Date: 7th Jan 2024
Description: This is a simple example of lambda expression
 */

public class LambdaExample {
    public static void main(String[] args) {
        //lambda expression is a function without a name
        Animal dog = () -> System.out.println("Dog is eating chicken.");

        Animal cat = () -> System.out.println("Cat is eating fish.");

        Animal cow = () -> System.out.println("Cow is eating grass.");

        Animal horse = () -> System.out.println("Horse is eating hay.");

        Animal goat = () -> System.out.println("Goat is eating grass.");
        //calling the eat method without a lambda expression
        eat(dog);
        eat(cat);
        eat(cow);
        eat(horse);
        eat(goat);
        //calling the eat method with a lambda expression
        eat(() -> System.out.println("Rabbit is eating carrot"));


        //calling the add method with a lambda expression
        Addable addable = (a, b) -> {
            return a + b;

        };

        System.out.println(addable.add(10, 20));

        //calling the add method with a lambda expression
        Addable addable1 = (a, b) -> a + b;
        System.out.println(addable1.add(100, 200));

    }
    static void  eat(Animal animal) {
        animal.run();
        animal.eat();
        animal.sleep();
    }


}
