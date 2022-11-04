package br.com.person.services;


import br.com.person.entities.Person;
import br.com.person.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonServices {

    private final PersonRepository personRepository;

    public PersonServices(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person save(Person person){
        return personRepository.save(person);
    }

}
