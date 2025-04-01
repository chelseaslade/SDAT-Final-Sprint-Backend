package org.keyin.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/people")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @DeleteMapping
    public void deletePerson(@RequestBody Person person) {
        personRepository.delete(person);
    }

    @PutMapping
    public Person updatePerson(@RequestBody Person person) {
        return personRepository.save(person);
    }
}
