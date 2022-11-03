package br.com.person.entities;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TypePersonTest {

    @ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
    @CsvSource(value = {"1, FISICA","2, JURIDICA"})
    public void getTypePersonById(Integer value, String description){
        TypePerson typePerson = TypePerson.getTypePersonById(value);
        assertEquals(value, typePerson.getId());
        assertEquals(description, typePerson.getDescription());
    }


    @ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
    @CsvSource(value = {"1, FISICA","2, JURIDICA"})
    public void getTypePersonByDescription(Integer value, String description){
        TypePerson byId = TypePerson.getTypeByDescritpion(description);
        assertEquals(value, byId.getId());
        assertEquals(description, byId.getDescription());
    }


    @ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
    @CsvSource(value = {"99, ERROR"})
    public void getTypePersonByIdException(Integer value, String description){
        assertThrows(IllegalArgumentException.class, () -> TypePerson.getTypePersonById(value));
    }


    @ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
    @CsvSource(value = {"99, ERROR"})
    public void getTypePersonByDescriptionException(Integer value, String description){
        assertThrows(IllegalArgumentException.class, () -> TypePerson.getTypeByDescritpion(description));
    }




}