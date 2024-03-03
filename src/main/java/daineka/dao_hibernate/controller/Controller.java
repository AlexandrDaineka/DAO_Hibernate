package daineka.dao_hibernate;

import daineka.dao_hibernate.entity.Persons;
import daineka.dao_hibernate.repository.RepositoryClass;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class ControllerClass {
    private final RepositoryClass repository;

    @GetMapping("/by-city")
    public List<Persons> getListPersonByCity(@RequestParam String cityOfLiving) {
        return repository.getPersonsByCity(cityOfLiving);
    }
}
