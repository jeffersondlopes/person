package br.com.person.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Person {

    @Id
    private Long id;

    @Embedded
    private BasicPerson person;

}
