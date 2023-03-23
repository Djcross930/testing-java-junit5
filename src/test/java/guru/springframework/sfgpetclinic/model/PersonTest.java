package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void groupedAssertions() {
        //given
        Person person = new Person(11L, "Joe", "Buck");
        //then
        assertAll("Test Props set",
                () -> assertEquals(person.getFirstName(), "Joe"),
                () -> assertEquals(person.getLastName(), "Buck"));
    }
    @Test
    void groupedAssertionMsgs() {
        //given
        Person person = new Person(11L, "Joe", "Buck");
        //then
        assertAll("Test Props set",
                () -> assertEquals(person.getFirstName(), "Joe", "First name failed"),
                () -> assertEquals(person.getLastName(), "Buck", "Last name failed"));
    }
}