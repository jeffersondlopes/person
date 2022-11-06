package br.com.person.dto.request;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@Builder
public class PersonRequest {

    @NotEmpty
    @NotNull
    @Size(min = 10, max = 100)
    private String name;
    private Long documentNumber;
    private String shortName;
    private String eMail;
    private Integer typePersonId;

}
