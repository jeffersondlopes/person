package br.com.person.mapper;

import br.com.person.dto.request.PersonRequest;
import br.com.person.dto.response.PersonResponse;
import br.com.person.entities.BasicPerson;
import br.com.person.entities.Person;
import br.com.person.entities.TypePerson;
import br.com.person.utils.mapper.PersonMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PersonMapTests {

    @Autowired
    private PersonMapper mapper;

    @Test
    public void PersonRequestToPersonConverterTest() {
        PersonRequest personRequest = PersonRequest.builder()
                .name("a;ldsjfalkds")
                .eMail("jkalsjdflkjds;@kjal;jsdfad")
                .typePersonId(1)
                .documentNumber(1234567890L)
                .shortName("akjsjlfkajsdkf")
                .build();

        Person person = mapper.toPerson(personRequest);

        assertEquals(TypePerson.PF, person.getPerson().getTypePerson());

    }

    @Test
    public void PersonEntityToPersonResponseConverterTest() {

        BasicPerson basicPerson = BasicPerson
                .builder()
                .typePerson(TypePerson.PF)
                .shortName("a;lkdjflkasjdf")
                .name("lakdsjf;ljsad;lf")
                .documentNumber(1234567890L)
                .eMail("jefferson@t;alkdjsf;l")
                .build();

        Person person = Person.builder()
                .id(1L)
                .person(basicPerson)
                .build();

        PersonResponse personResponse = mapper.toPersonResponde(person);

        System.out.println(personResponse);


    }

}
