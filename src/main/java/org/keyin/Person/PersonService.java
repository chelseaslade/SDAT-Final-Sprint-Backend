package org.keyin.Person;

import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Transactional
    public Person addPerson(Person person) {
        return personRepository.save(person);
    }

    @Transactional
    public Person updatePerson(Long id, Person updatedPerson) {
        Optional<Person> optionalPerson = personRepository.findById(id);
        if (optionalPerson.isPresent()) {
            Person person = optionalPerson.get();
            person.setFirstName(updatedPerson.getFirstName());
            person.setSurname(updatedPerson.getSurname());
            return personRepository.save(person);
        }
        throw new RuntimeException("Person not found");
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
