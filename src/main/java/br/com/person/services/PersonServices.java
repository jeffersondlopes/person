package br.com.person.services;


import br.com.person.entities.Person;
import br.com.person.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonServices {

    private PersonRepository personRepository;

    public Person save(Person person){
        return personRepository.save(person);
    }

}
