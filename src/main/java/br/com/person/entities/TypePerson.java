package br.com.person.entities;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum TypePerson {

    PF(1,"FISICA"),
    PJ(2,"JURIDICA");
    private final Integer id;
    private final String description;

    TypePerson(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public static TypePerson getTypeByDescritpion(String value) {
        return Arrays.stream(TypePerson.values())
                .filter(tp -> tp.description.equals(value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("TypePerson %s not exists", value)));
    }

    public static TypePerson getTypePersonById(Integer id) {
        return Arrays.stream(TypePerson.values())
                .filter(tp -> tp.id.equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("TypePerson %d not exists", id)));
    }


}
