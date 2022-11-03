package br.com.person.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Transient;

@Getter
@Setter
public class BasicPerson {

    @Column(name = "NAME")
    private String name;
    @Column(name = "SHORT_NAME")
    private String shortName;
    @Column(name = "EMAIL")
    private String eMail;

    @Column(name = "TYPE_PERSON")
    private Integer typePersonId;

    @Transient
    private TypePerson typePerson;

    @Column(name = "DOCUMENT_NUMBER")
    private Long documentNumber;

}
