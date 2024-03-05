package daineka.dao_hibernate.repository;

import daineka.dao_hibernate.entity.PersonEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;

import java.util.List;

@org.springframework.stereotype.Repository
@RequiredArgsConstructor
public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<PersonEntity> getPersonsByCity(String city) {
        return entityManager.createQuery("SELECT p FROM persons p WHERE p.city_of_living = :city", PersonEntity.class)
                .setParameter("city", city)
                .getResultList();
    }

}
