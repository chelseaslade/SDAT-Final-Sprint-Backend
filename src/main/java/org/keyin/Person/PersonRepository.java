package org.keyin.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
