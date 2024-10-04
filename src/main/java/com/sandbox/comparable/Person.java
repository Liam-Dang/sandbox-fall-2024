package com.sandbox.comparable;

import java.util.*;

import java.util.List;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person other) {
        int lastNameComparison = this.lastName.compareTo(other.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }
        int firstNameComparison = this.firstName.compareTo(other.firstName);
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }
        return Integer.compare(this.age, other.age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Joe", "Doe", 30);
        Person person2 = new Person("Jane", "Doe", 25);
        Person person3 = new Person("John", "Doe", 25);
        Person person4 = new Person("Jane", "Doe", 30);

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        System.out.println("Before sorting:");
        people.forEach(System.out::println);

        Collections.sort(people);
        System.out.println("After sorting:");
        people.forEach(System.out::println);

    }
}