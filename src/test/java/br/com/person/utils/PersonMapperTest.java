package br.com.person.utils;

import br.com.person.dto.request.PersonRequest;
import br.com.person.entities.Person;
import org.junit.jupiter.api.Test;

class PersonMapperTest {

    @Test
    public void test(){

        PersonRequest request = PersonRequest.builder()
                .typePersonId(1)
                .documentNumber(201865931810L)
                .eMail("jose@gmail.com")
                .typePersonId(1)
                .name("Jose Carlos da Silva")
                .shortName("José Carlos")
                .build();

        Person person = PersonMapper.INSTANCE.PersonRequestToPersonEntities(request);

        System.out.println(person);

    }

}