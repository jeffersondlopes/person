package br.com.person.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BasicPerson {

    private String name;
    private String shortName;
    private String eMail;
    private TypePerson typePerson;
    private Long documentNumber;

}
