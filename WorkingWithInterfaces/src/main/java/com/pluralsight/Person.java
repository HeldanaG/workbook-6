package com.pluralsight;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        if (this.getLastName().equalsIgnoreCase(otherPerson.getLastName()) && this.getFirstName().equalsIgnoreCase(otherPerson.getFirstName())) {
            return Integer.compare(this.getAge(), otherPerson.getAge());
        } else if (this.getLastName().equalsIgnoreCase(otherPerson.getLastName()))
        {
            return this.getFirstName().compareToIgnoreCase(otherPerson.getFirstName());
        }
       else{
            return this.getFirstName().compareToIgnoreCase(otherPerson.getFirstName());

        }

    }
}
