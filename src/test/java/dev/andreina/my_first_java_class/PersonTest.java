package dev.andreina.my_first_java_class;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void testMostrar() {

        
        
    }
    @Test
    void testPerson() {
        Person person=  new Person("Andreina", "Arias", "Z1519988P", 1986, "Venezuela", 'M');
        assertEquals("Andreina", person.getFirstName());
        assertEquals("Arias", person.getLastName());
        assertEquals("Z1519988P", person.getDocumentId());
        assertEquals(1986, person.getYearOfBirth());
        assertEquals("Venezuela", person.getCountryOfBirth());
        assertEquals('M', person.getGender());
    }

}
