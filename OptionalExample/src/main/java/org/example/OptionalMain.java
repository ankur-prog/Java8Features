package org.example;

import java.util.Optional;

/**
 * created by Ankur on 13-01-2023
 * <p>
 *     Optional is a container object which may or may not contain a non-null value.
 *     If a value is present, isPresent() will return true and get() will return the value.
 *     Additional methods that depend on the presence or absence of a contained value are provided,
 *     such as orElse() (return a default value if value not present) and ifPresent() (execute a block of code if the value is present).
 *     This is a value-based class; use of identity-sensitive operations (including reference equality (==), identity hash code,
 *     or synchronization) on instances of Optional may have unpredictable results and should be avoided.
 *     The Optional class is primarily intended for use as a method return type where there is a clear need to represent "no result,"
 *     and where using null is likely to cause errors. A variable whose type is Optional should never itself be null;
 */

public class OptionalMain {
    public static void main(String[] args) {

        String email = "ankur.kushwaha@gmail.com";
        //empty method - creates an empty Optional object
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        //of method - throws NullPointerException if null value passed
        Optional<String> of = Optional.of(email);
        System.out.println(of);

        //ofNullable method - does not throw NullPointerException if null value passed
        Optional<String> ofNullable = Optional.ofNullable(null);
        System.out.println(ofNullable);
        //isPresent method - returns true if value is present
        System.out.println(of.isPresent());
        System.out.println(empty.isPresent());
        //get method - returns value, if present, otherwise throws NoSuchElementException
        System.out.println(of.get());
        //orElse method - returns value if present, otherwise returns other
        System.out.println(empty.orElse("World"));
        //orElseGet method - returns value if present, otherwise returns result of other
        System.out.println(empty.orElseGet(() -> "World"));
        //orElseThrow method - returns value if present, otherwise throws exception
        //System.out.println(empty.orElseThrow(() -> new RuntimeException("Empty")));
        //ifPresent method - performs action if value is present
        of.ifPresent(System.out::println);
        empty.ifPresent(System.out::println);
        //map method - returns Optional object
        System.out.println(of.map(String::toUpperCase).get());
        System.out.println(empty.map(String::toUpperCase).orElse("World"));
        //filter method  - returns Optional object
        System.out.println(of.filter(s -> s.length() > 3).get());
        System.out.println(of.filter(s -> s.length() > 5).orElse("World"));
        //flatMap method - returns Optional object
        System.out.println(of.flatMap(s -> Optional.of(s.toUpperCase())).get());
        //flatMap method - returns Optional.empty
        System.out.println(empty.flatMap(s -> Optional.of(s.toUpperCase())).orElse("World"));
        //equals method - returns boolean
        System.out.println(of.equals(Optional.of(email)));




    }
}