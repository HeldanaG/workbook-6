package com.pluralsight;

import java.util.*;


public class PersonApp {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
// create and add people to the list
        people.add(new Person("John", "Smith", 25));
        people.add(new Person("Alice", "Smith", 30));
        people.add(new Person("John", "Smith", 22));
        people.add(new Person("Bob", "Adams", 45));
        people.add(new Person("Alice", "Jones", 28));

        Collections.sort(people);

        //loop over the list
        for (Person myPerson : people){
            System.out.println(myPerson.getFirstName() + "," + myPerson.getLastName() + " - " + myPerson.getAge());
        }
    }
}
