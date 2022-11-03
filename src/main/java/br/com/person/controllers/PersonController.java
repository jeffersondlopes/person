package br.com.person.controllers;


import br.com.person.dto.request.PersonRequest;
import br.com.person.entities.Person;
import br.com.person.services.PersonServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/person")
public class PersonController {

    private final PersonServices personServices;

    public PersonController(PersonServices personServices) {
        this.personServices = personServices;
    }

    @PostMapping
    public PersonRequest save(PersonRequest person) {
        return person;
    }

}
