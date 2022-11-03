package br.com.person.services;

import br.com.person.entities.BasicPerson;
import br.com.person.entities.Person;
import br.com.person.entities.TypePerson;
import br.com.person.repository.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;




@ExtendWith(MockitoExtension.class)
class PersonServicesTest {

    @InjectMocks
    private PersonServices personServices;

    @Mock
    private PersonRepository repository;

    private Person person;

    @BeforeEach
    public void setUp(){

        BasicPerson basicPerson = BasicPerson.builder()
                .documentNumber(201865931810L)
                .eMail("jose@gmail.com")
                .typePerson(TypePerson.PF)
                .name("Jose Carlos da Silva")
                .shortName("José Carlos")
                .build();

        person = Person.builder()
                .id(1L)
                .person(basicPerson)
                .build();
    }

    @Test
    public void save() {
        when(repository.save(any(Person.class))).thenReturn(person);
        Person save = personServices.save(new Person());
        System.out.println(save.getId());
    }
}