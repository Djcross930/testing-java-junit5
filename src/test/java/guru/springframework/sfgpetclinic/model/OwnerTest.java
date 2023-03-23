package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1L, "Joe", "Buck");
        owner.setCity("Key West");
        owner.setTelephone("1231231234");

        assertAll("Properties test",
                () -> assertAll("person properties",
                    () -> assertEquals("Joe", owner.getFirstName(), "First name didnt match"),
                    () -> assertEquals("Buck", owner.getLastName(), "Last name didnt match")),
                () -> assertAll("Owner Properties",
                        () -> assertEquals("Key West", owner.getCity(), "City didnt match"),
                        () -> assertEquals("1231231234", owner.getTelephone(), "Number didnt match")
                ));
    }
}