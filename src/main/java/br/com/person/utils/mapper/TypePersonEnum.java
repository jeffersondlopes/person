package br.com.person.utils.mapper;

import br.com.person.entities.TypePerson;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses = {TypePersonEnum.class})
public interface TypePersonEnum {

    default TypePerson toTypePersonEnum(Integer typePersonId){
        return TypePerson.getTypePersonById(typePersonId);
    }

    default Integer toTypePersonEnum(TypePerson typePerson){
        return typePerson.getId();
    }

}
