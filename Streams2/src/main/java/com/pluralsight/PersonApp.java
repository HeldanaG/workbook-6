package com.pluralsight;

import java.util.*;
import java.util.stream.Collectors;


public class PersonApp {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Heldana", "Daniel", 22));
        people.add(new Person("John", "Smith", 25));
        people.add(new Person("Alice", "Jones", 28));
        people.add(new Person("Bob", "Adams", 45));
        people.add(new Person("Maria", "Garcia", 30));
        people.add(new Person("Daniel", "Lee", 20));
        people.add(new Person("Sophia", "Brown", 26));
        people.add(new Person("Michael", "Clark", 35));
        people.add(new Person("Emily", "Davis", 22));
        people.add(new Person("Noah", "Taylor", 29));

        // Step 1: Search names starting with "D" using stream and filter
        List<Person> dNames = people.stream()
                .filter(person -> person.getFirstName().startsWith("D"))
                .collect(Collectors.toList());
        System.out.println("Names starting with D:");
        dNames.forEach(System.out::println);

        // Step 2: Calculate average age using streams
        OptionalDouble avgAge = people.stream()
                .mapToInt(Person::getAge)
                .average();
        System.out.println("\nAverage age: " + (avgAge.isPresent() ? avgAge.getAsDouble() : "N/A"));

        // Step 3: Find oldest age
        int maxAge = people.stream()
                .mapToInt(Person::getAge)
                .max()
                .orElse(-1);
        System.out.println("Oldest age: " + maxAge);

        // Step 3: Find youngest age
        int minAge = people.stream()
                .mapToInt(Person::getAge)
                .min()
                .orElse(-1);
        System.out.println("Youngest age: " + minAge);
    }
}
