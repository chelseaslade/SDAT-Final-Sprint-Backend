package org.keyin.Person;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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
            person.setAge(updatedPerson.getAge());
            person.setGender(updatedPerson.getGender());
            person.setFunds(updatedPerson.getFunds());
            person.setAppearance(updatedPerson.getAppearance());
            person.setHappiness(updatedPerson.getHappiness());
            person.setIntelligence(updatedPerson.getIntelligence());
            return personRepository.save(person);
        }
        throw new RuntimeException("Person not found");
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public void deleteMainCharacter(Long personId) {
        Optional<Person> person = personRepository.findById(personId);
        person.ifPresent(personRepository::delete);
    }

    public Person ageUp(Person person) {
        person.setAge(person.getAge() + 1);

        return personRepository.save(person);
    }

    @Modifying
    @Query("UPDATE Person p SET p.happiness = :happiness WHERE p.id = :id")
    void updateHappiness(@Param("id") Long id, @Param("happiness") int happiness) {
    }

}
