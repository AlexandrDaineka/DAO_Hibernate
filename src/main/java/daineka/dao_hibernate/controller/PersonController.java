package daineka.dao_hibernate.controller;

import daineka.dao_hibernate.entity.PersonEntity;
import daineka.dao_hibernate.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {
    private final PersonRepository repository;

    @GetMapping("/by-city")
    public List<PersonEntity> getListPersonByCity(@RequestParam String city_of_living) {
        return repository.getPersonsByCity(city_of_living);
    }
}
