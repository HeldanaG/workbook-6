package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

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

        boolean appRunning = true;
        Scanner input = new Scanner(System.in);

        while (appRunning) {
            System.out.print("Do you want to look by first name or last name (first/last): ");
            String optionName = input.nextLine().trim();

            if (optionName.equalsIgnoreCase("first")) {
                System.out.print("Enter first name: ");
                String firstName = input.nextLine().trim();
                for (Person p : people) {
                    if (firstName.equalsIgnoreCase(p.getFirstName())) {
                        System.out.println(p);
                    }
                }
            } else if (optionName.equalsIgnoreCase("last")) {
                System.out.print("Enter last name: ");
                String lastName = input.nextLine().trim();
                for (Person p : people) {
                    if (lastName.equalsIgnoreCase(p.getLastName())) {
                        System.out.println(p);
                    }
                }
            } else {
                System.out.println("Invalid input. Please enter 'first' or 'last'.");
            }

            System.out.print("Do you want to look up another name (yes/no): ");
            String lookAgain = input.nextLine().trim();
            if (!lookAgain.equalsIgnoreCase("yes")) {
                appRunning = false;
            }
        }

        // Calculate average, oldest, youngest
        int totalAge = 0;
        int maxAge = Integer.MIN_VALUE;
        int minAge = Integer.MAX_VALUE;
        Person oldestPerson = null;
        Person youngestPerson = null;
        for (Person p : people) {
            int age = p.getAge();
            totalAge += age;

            if (age > maxAge) {
                maxAge = age;
                oldestPerson = p;
            }

            if (age < minAge) {
                minAge = age;
                youngestPerson = p;
            }
        }

        double averageAge = (double) totalAge / people.size();

        System.out.printf("Average age: %.2f\n", averageAge);
        System.out.println("Oldest person: " + oldestPerson.getFirstName() + " " + oldestPerson.getLastName() + " - Age: " + maxAge);
        System.out.println("Youngest person: " + youngestPerson.getFirstName() + " " + youngestPerson.getLastName() + " - Age: " + minAge);
    }
}
