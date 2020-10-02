package kz.aitu.mid.midtermCS1905.service;

import kz.aitu.mid.midtermCS1905.model.Person;
import kz.aitu.mid.midtermCS1905.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAll(){
        return (List<Person>) personRepository.findAll();
    }

    public Person getById(long id){
        return personRepository.findById(id);
    }

    public void deleteById(long id){
        personRepository.deleteById(id);
    }

    public Person create(Person person){
        return personRepository.save(person);
    }

    public Person save(Person person){
        return personRepository.save(person);
    }

    public Person updatePerson(Person person){
        return personRepository.save(person);
    }


}
