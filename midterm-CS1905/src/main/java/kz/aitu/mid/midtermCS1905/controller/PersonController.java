package kz.aitu.mid.midtermCS1905.controller;

import kz.aitu.mid.midtermCS1905.model.Person;
import kz.aitu.mid.midtermCS1905.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/api/v2/users")
    public ResponseEntity<?> getPerson() {
        return ResponseEntity.ok(personService.getAll());
    }


    @PutMapping("/api/v2/users/")
    public ResponseEntity<?> updatePerson(@RequestBody Person person) {
        return ResponseEntity.ok(personService.save(person));
    }

    @PostMapping("/api/v2/users/")
    public ResponseEntity<?> savePerson(@RequestBody Person person) {
        return ResponseEntity.ok(personService.create(person));
    }


    @DeleteMapping("/api/v2/users/{id}")
    public void deleteActivateJournal(@PathVariable Long person) {
        personService.deleteById(person);
    }
}
