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
}