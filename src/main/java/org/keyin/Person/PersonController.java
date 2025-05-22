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
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id) {
        return personService.getPersonByID(id);
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @DeleteMapping
    public void deletePerson(@RequestBody Person person) {
        personRepository.delete(person);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMainCharacter(@PathVariable Long id) {
        personService.deleteMainCharacter(id);
    }

    @PutMapping
    public Person updatePerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @PutMapping("/update/{id}")
    public Person updatePersonByID(@PathVariable Long id) {
        return personService.updatePersonByID(id);
    }

    @PutMapping("/ageup/{id}")
    public Person ageUp(@PathVariable Long id) {
        return personService.ageUp(id);
    }
}
