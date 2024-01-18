package org.example;

public class Student {
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

}
