package dev.jenny.person;

public class Person {

    private String name;
    private String lastName;
    private String document;
    private int birthYear;

    public Person(String name, String lastName, String document, int birthYear) {
        this.name = name;
        this.lastName = lastName;
        this.document = document;
        this.birthYear = birthYear;
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
}