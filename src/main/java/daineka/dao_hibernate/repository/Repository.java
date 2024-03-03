package daineka.dao_hibernate.repository;

import daineka.dao_hibernate.entity.Persons;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;

import java.util.List;

@org.springframework.stereotype.Repository
@RequiredArgsConstructor
public class Repository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Persons> getPersonsByCity(String city) {
        return entityManager.createQuery("SELECT p FROM persons p WHERE p.cityOfLiving = :city", Persons.class)
                .setParameter("city", city)
                .getResultList();
    }

}
