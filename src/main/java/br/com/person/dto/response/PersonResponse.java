package br.com.person.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class PersonResponse {

    private Long id;
    private String name;
    private Long documentNumber;
    private String shortName;
    private String eMail;
    private Integer typePersonId;

}
