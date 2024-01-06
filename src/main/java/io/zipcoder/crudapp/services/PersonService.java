package io.zipcoder.crudapp.services;

import io.zipcoder.crudapp.models.Person;
import io.zipcoder.crudapp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person createPerson(Person p) {
        return null;
    }

    public Person getPerson(Long id) {
        return null;
    }

    public List<Person> getPersonList() {
        return null;
    }

    public Person updatePerson(Long id) {
        return null;
    }

    public void deletePerson(Long id) {

    }
}
