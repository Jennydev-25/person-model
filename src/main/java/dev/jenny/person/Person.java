package dev.jenny.person;

import java.time.Year;

public class Person {

    private String name;
    private String lastName;
    private String document;
    private int birthYear;
    private int age;

    public Person(String name, String lastName, String document, int birthYear) {
        this.name = name;
        this.lastName = lastName;
        this.document = document;
        this.birthYear = birthYear;
        calculateAge();
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDocument() {
        return document;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return age;
    }

    private void calculateAge() {
        this.age = Year.now().getValue() - this.birthYear;
    }
}