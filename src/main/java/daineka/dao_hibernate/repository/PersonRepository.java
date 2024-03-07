package daineka.dao_hibernate.repository;

import daineka.dao_hibernate.entity.PersonEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<PersonEntity> getPersonsByCity(String city) {
        return entityManager.createQuery("SELECT p FROM persons p WHERE p.cityOfLiving = :city", PersonEntity.class)
                .setParameter("city", city)
                .getResultList();
    }

}
