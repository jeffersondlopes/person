package br.com.person.utils;

import br.com.person.dto.request.PersonRequest;
import br.com.person.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface PersonMapper {

    //Mappers.getMapper(PersonMapper.class);
    PersonMapper INSTANCE = Mappers.getMapper( PersonMapper.class );

    Person PersonRequestToPersonEntities(PersonRequest request);

}
