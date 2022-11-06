package br.com.person.dto.response;

import br.com.person.entities.TypePerson;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
public class PersonResponse {

    private Long id;
    private String name;
    private Long documentNumber;
    private String shortName;
    private String eMail;
    private TypePerson typePerson;

}
