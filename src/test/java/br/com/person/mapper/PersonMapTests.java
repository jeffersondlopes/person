package br.com.person.mapper;

import br.com.person.dto.request.PersonRequest;
import br.com.person.entities.Person;
import br.com.person.utils.mapper.PersonMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PersonMapTests {

    @Autowired
    private PersonMapper mapper;

    @Test
    public void map() {
        PersonRequest personRequest = PersonRequest.builder()
                .name("a;ldsjfalkds")
                .eMail("jkalsjdflkjds;@kjal;jsdfad")
                .typePersonId(1)
                .documentNumber(1234567890L)
                .shortName("akjsjlfkajsdkf")
                .build();

        Person person = mapper.toPerson(personRequest);

        System.out.println(person);

    }

}
