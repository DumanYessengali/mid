package kz.aitu.mid.midtermCS1905.repository;

import kz.aitu.mid.midtermCS1905.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonRepository extends CrudRepository<Person, Long> {
    Person findById(long id);
}
