package br.com.person.entities;

import lombok.*;

import javax.annotation.PostConstruct;
import javax.persistence.Column;
import javax.persistence.PrePersist;
import javax.persistence.Transient;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BasicPerson {

    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "SHORT_NAME")
    private String shortName;
    @Column(name = "EMAIL")
    private String eMail;

    @Column(name = "TYPE_PERSON")
    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    private Integer typePersonId;

    @Transient
    private TypePerson typePerson;

    @Column(name = "DOCUMENT_NUMBER")
    private Long documentNumber;
    @PrePersist
    private void setTypePersonEnum(){
        this.typePersonId = typePerson.getId();
    }
    @PostConstruct
    private void getTypePersonEnum(){
        this.typePerson = TypePerson.getTypePersonById(this.typePersonId);
    }


}
