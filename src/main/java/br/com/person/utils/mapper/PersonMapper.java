package br.com.person.utils.mapper;

import br.com.person.dto.request.PersonRequest;
import br.com.person.dto.response.PersonResponse;
import br.com.person.entities.Person;
import br.com.person.entities.TypePerson;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface PersonMapper {

    @Mapping(target = "person", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "name", target = "person.name")
    @Mapping(source = "shortName", target = "person.shortName")
    @Mapping(source = "documentNumber", target = "person.documentNumber")
    @Mapping(source = "typePersonId", target = "person.typePerson")
    @Mapping(source = "EMail", target = "person.eMail")
    Person toPerson(PersonRequest request);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "person.name", target = "name")
    @Mapping(source = "person.shortName", target = "shortName")
    @Mapping(source = "person.documentNumber", target = "documentNumber")
    @Mapping(source = "person.typePerson", target = "typePersonId")
    @Mapping(source = "person.EMail", target = "eMail")
    PersonResponse toPersonResponde(Person person);

    default TypePerson toTypePersonEnum(Integer typePersonId){
        return TypePerson.getTypePersonById(typePersonId);
    }

    default Integer toTypePersonEnum(TypePerson typePerson){
        return typePerson.getId();
    }

}
