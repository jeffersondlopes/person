package br.com.person.controllers;


import br.com.person.dto.request.PersonRequest;
import br.com.person.dto.response.PersonResponse;
import br.com.person.entities.Person;
import br.com.person.services.PersonServices;
import br.com.person.utils.PersonMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/person")
public class PersonController {

    private final PersonServices personServices;
    private final PersonMapper mapper;

    public PersonController(PersonServices personServices, PersonMapper mapper) {
        this.personServices = personServices;
        this.mapper = mapper;
    }

    @PostMapping
    public PersonResponse save(@RequestBody  PersonRequest personRequest) {
        Person person = personServices.save(mapper.toPerson(personRequest));
        return mapper.toPersonResponde(person);
    }

}
