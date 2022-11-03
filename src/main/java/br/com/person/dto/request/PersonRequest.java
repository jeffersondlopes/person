package br.com.person.dto.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class PersonRequest {

    private String name;
    private Long documentNumber;
    private String shortName;
    private String eMail;
    private Integer typePersonId;

}