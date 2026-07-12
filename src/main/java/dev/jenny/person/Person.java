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
        this.age = calculateAge();
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getDocument() {
        return this.document;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public int getAge() {
        return this.age;
    }

    public int calculateAge() {
        return Year.now().getValue() - this.birthYear;
    }
}