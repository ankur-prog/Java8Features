package com.ankur.functional;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // print numbers from 1 to 10
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isGreaterThan5 = n -> n > 5;

// Using and()
        Predicate<Integer> isEvenAndGreaterThan5 = isEven.and(isGreaterThan5);
        System.out.println(isEvenAndGreaterThan5.test(12)); // prints: true
        System.out.println(isEvenAndGreaterThan5.test(4)); // prints: false

// Using or()
        Predicate<Integer> isEvenOrGreaterThan5 = isEven.or(isGreaterThan5);
        System.out.println(isEvenOrGreaterThan5.test(4)); // prints: true
        System.out.println(isEvenOrGreaterThan5.test(3)); // prints: false

// Using negate()
        Predicate<Integer> isNotEven = isEven.negate();
        System.out.println(isNotEven.test(4)); // prints: false
}
}
