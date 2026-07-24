package dev.jenny.person;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isA;

import java.time.Year;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Jenny", "Sanchez", "12345678Z", 1995);
    }

    @Test
    void testGetName() {
        assertThat(person.getName(), isA(String.class));
        assertThat(person.getName(), is(equalTo("Jenny")));
    }

    @Test
    void testGetLastName() {
        assertThat(person.getLastName(), isA(String.class));
        assertThat(person.getLastName(), is(equalTo("Sanchez")));
    }

    @Test
    void testGetDocument() {
        assertThat(person.getDocument(), isA(String.class));
        assertThat(person.getDocument(), is(equalTo("12345678Z")));
    }

    @Test
    void testGetBirthYear() {
        assertThat(person.getBirthYear(), isA(Integer.class));
        assertThat(person.getBirthYear(), is(equalTo(1995)));
    }

    @Test
    void testGetAge() {
        assertThat(person.getAge(), isA(Integer.class));
        assertThat(person.getAge(), is(equalTo(Year.now().getValue() - 1995)));
    }
}