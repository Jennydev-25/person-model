package dev.jenny.person;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void testConstructorCreatesPerson() {
        Person person = new Person("Jenny", "Sanchez", "12345678Z", 1995);

        assertThat(person, is(notNullValue()));
    }

    @Test
    void testGetNameReturnsName() {
        Person person = new Person("Jenny", "Sanchez", "12345678Z", 1995);

        assertThat(person.getName(), is("Jenny"));
    }

    @Test
    void testGetLastNameReturnsLastName() {
        Person person = new Person("Jenny", "Sanchez", "12345678Z", 1995);

        assertThat(person.getLastName(), is("Sanchez"));
    }

    @Test
    void testGetDocumentReturnsDocument() {
        Person person = new Person("Jenny", "Sanchez", "12345678Z", 1995);

        assertThat(person.getDocument(), is("12345678Z"));
    }

    @Test
    void testGetBirthYearReturnsBirthYear() {
        Person person = new Person("Jenny", "Sanchez", "12345678Z", 1995);

        assertThat(person.getBirthYear(), is(1995));
    }
}