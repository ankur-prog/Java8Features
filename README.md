# Java 8 Features Learning Repository

Welcome to the Java 8 Features Learning Repository! This repository is designed to help you learn and understand the new features introduced in Java 8 with practical examples. Whether you are a beginner or an experienced Java developer, this resource aims to provide hands-on examples and explanations to deepen your understanding of Java 8.

## Table of Contents

1. [Introduction to Java 8](#introduction-to-java-8)
2. [Lambda Expressions](#lambda-expressions)
4. [Functional Interfaces](#functional-interfaces)
5. [Streams API](#streams-api)
6. [Default Methods](#default-methods)
7. [Method References](#MethodReference)
8. [Optional](#optional)
9. [New Date and Time API](#new-date-and-time-api)

## Introduction to Java 8

Java 8 brought several significant features to the language, enhancing its capabilities and making code more expressive and concise. Before diving into specific features, make sure to have Java 8 installed on your machine. You can download it [here](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html).

## Lambda Expressions

Lambda expressions introduce a concise way to express instances of single-method interfaces (functional interfaces). Explore how to use lambda expressions to write more expressive and compact code.

Example:
```java
// Before Java 8
Runnable oldRunnable = new Runnable() {
    public void run() {
        System.out.println("Old way to run a thread");
    }
};

// Java 8 with lambda expression
Runnable newRunnable = () -> System.out.println("New way to run a thread");
```

For detailed examples and explanations, refer to the [Lambda Expressions](./LambdaExpression) section.

## Functional Interfaces

Functional interfaces play a crucial role in the adoption of lambda expressions. Learn how to create and use functional interfaces to leverage the power of lambda expressions.

Example:
```java
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}

MyFunctionalInterface myFunction = () -> System.out.println("Executing myMethod");
```

Explore more in the [Functional Interfaces](./FunctionalInterface) section.

## Streams API

The Streams API provides a powerful and functional approach to process collections of data. Learn how to use streams to perform operations on collections in a more concise and expressive manner.

Example:
```java
List<String> words = Arrays.asList("Java", "8", "Streams", "API");

long count = words.stream()
                  .filter(word -> word.length() > 3)
                  .count();

System.out.println("Number of words with length > 3: " + count);
```

Delve deeper into the [Streams API](./streamAPI) section for comprehensive examples.

## Default Methods

Default methods allow interfaces to have methods with implementations. This feature enhances backward compatibility and supports evolving APIs without breaking existing implementations.

Example:
```java
interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default implementation");
    }
}

class MyClass implements MyInterface {
    // No need to override defaultMethod
}

MyClass myObject = new MyClass();
myObject.defaultMethod(); // Outputs: Default implementation
```

Discover more about [Default Methods](./default-methods) in Java 8.

## Method References

Method references provide a shorthand notation for lambda expressions, making the code more readable. Explore how to use method references in various contexts.

Example:
```java
List<String> names = Arrays.asList("John", "Alice", "Bob");

// Using lambda expression
names.forEach(name -> System.out.println(name));

// Using method reference
names.forEach(System.out::println);
```

Learn more in the [Method References](./method-references) section.

## Optional

The `Optional` class was introduced to address the issue of dealing with potentially null values more effectively. Understand how `Optional` can be used to handle null values gracefully.

Example:
```java
String name = // get a value from a method that may return null
Optional<String> optionalName = Optional.ofNullable(name);

String result = optionalName.orElse("DefaultName");
```

Check out the [Optional](./OptionalExample) section for detailed examples.

## New Date and Time API

Java 8 introduced a modern and comprehensive Date and Time API, addressing the shortcomings of the old `java.util.Date` and `java.util.Calendar` classes.

Example:
```java
LocalDate currentDate = LocalDate.now();
LocalDate nextYear = currentDate.plusYears(1);

System.out.println("Current date: " + currentDate);
System.out.println("Date next year: " + nextYear);
```

Explore the [New Date and Time API](./new-date-and-time-api) for a thorough understanding.

## Contribution

Feel free to contribute by adding more examples, explanations, or correcting any mistakes in the existing content. Follow the standard GitHub workflow:

1. Fork the repository.
2. Create a new branch for your changes: `git checkout -b feature/your-feature`.
3. Make your changes and commit: `git commit -m "Description of your changes."`.
4. Push your branch to your fork: `git push origin feature/your-feature`.
5. Create a pull request.

Happy learning!
