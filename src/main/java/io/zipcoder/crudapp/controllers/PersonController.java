package io.zipcoder.crudapp.controllers;

import io.zipcoder.crudapp.models.Person;
import io.zipcoder.crudapp.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/people")
    public ResponseEntity<?> createPerson(@RequestBody Person p) {
        Person newPerson = personService.createPerson(p);
        return new ResponseEntity<>(newPerson, HttpStatus.CREATED);
    }

    @GetMapping("/people/{id}")
    public ResponseEntity<?> getPerson(@PathVariable Long id) {
        Person p = personService.getPerson(id);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @GetMapping("/people")
    public ResponseEntity<?> getPersonList() {
        List<Person> people = personService.getPersonList();
        return new ResponseEntity<>(people, HttpStatus.OK);
    }

    @PutMapping("/people/{id}")
    public ResponseEntity<?> updatePerson(@PathVariable Long id) {
        Person p = personService.updatePerson(id);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @DeleteMapping("/people/{id}")
    public ResponseEntity<?> deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
        return ResponseEntity.noContent().build();
    }
}
