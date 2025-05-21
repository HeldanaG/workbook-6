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
        if (this.getFirstName().equalsIgnoreCase(otherPerson.getFirstName()) &&
                this.getLastName().equalsIgnoreCase(otherPerson.getLastName())) {
            return Integer.compare(this.getAge(), otherPerson.getAge());
        }
        else if (this.getFirstName().equalsIgnoreCase(otherPerson.getFirstName())) {
            return this.getLastName().compareToIgnoreCase(otherPerson.getLastName());
        }
        else {
            return this.getFirstName().compareToIgnoreCase(otherPerson.getFirstName());
        }
    }


}
