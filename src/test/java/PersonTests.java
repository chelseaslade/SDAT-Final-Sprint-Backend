import org.keyin.Person.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PersonTests {
    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    private Person testPerson;

    @BeforeEach
    void setUp() {
        testPerson = new Person();
        testPerson.setId(1L);
        testPerson.setFirstName("John");
        testPerson.setSurname("Doe");
        testPerson.setAge(20);
        testPerson.setHappiness(75);
        testPerson.setHealth(100);
        testPerson.setIntelligence(75);
    }

    @Test
    void testAddPerson() {
        when(personRepository.save(any(Person.class))).thenReturn(testPerson);

        Person savedPerson = personService.addPerson(testPerson);

        assertNotNull(savedPerson);
        assertEquals("John", savedPerson.getFirstName());
        verify(personRepository, times(1)).save(testPerson);
    }

    @Test
    void testUpdatePerson() {
        when(personRepository.findById(1L)).thenReturn(Optional.of(testPerson));

        Person updatedPerson = new Person();
        updatedPerson.setFirstName("Jane");
        updatedPerson.setSurname("Martin");
        updatedPerson.setAge(30);

        personService.updatePerson(testPerson.getId(), updatedPerson);

        assertNotNull(updatedPerson);
        assertEquals("Jane", updatedPerson.getFirstName());
        verify(personRepository, times(1)).save(any(Person.class));
    }

    @Test
    void getPersonById() {
        when(personRepository.findById(1L)).thenReturn(Optional.of(testPerson));

        Person testResult = personService.getPersonByID(1L);

        assertNotNull(testResult);
        assertEquals("John", testResult.getFirstName());
        verify(personRepository, times(1)).findById(1L);
    }

    @Test
    void ageUpPerson() {
        when(personRepository.findById(1L)).thenReturn(Optional.of(testPerson));

        Person testResult = personService.getPersonByID(1L);
        personService.ageUp(testResult);

        assertNotNull(testResult);
        assertEquals(21, testResult.getAge());
        verify(personRepository, times(1)).save(testPerson);

    }

    @Test
    void unableToRetrievePerson() {
        when(personRepository.findById(2L)).thenReturn(Optional.empty());

        Person testResult = personService.getPersonByID(2L);

        assertNull(testResult);
        verify(personRepository, times(1)).findById(2L);
    }


}
