package br.com.person.controllers;

import br.com.person.dto.request.PersonRequest;
import br.com.person.entities.BasicPerson;
import br.com.person.entities.Person;
import br.com.person.entities.TypePerson;
import br.com.person.services.PersonServices;
import br.com.person.utils.mapper.PersonMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class PersonControllerTest {

    @Mock
    PersonServices personServices;

    @Mock
    PersonMapper mapper;

    @InjectMocks
    PersonController controller;

    @BeforeEach
    void setUp() {
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

        given(mapper.toPerson(any(PersonRequest.class))).willReturn(person);
        given(personServices.save(any(Person.class))).willReturn(person);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {

    }
}