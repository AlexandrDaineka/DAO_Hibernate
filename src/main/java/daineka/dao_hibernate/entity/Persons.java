package daineka.dao_hibernate.entity;

import daineka.dao_hibernate.pojo.PersonsId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity(name = "persons") // наименование таблицы
@Builder
@NoArgsConstructor
@AllArgsConstructor
@IdClass(PersonsId.class)
public class Persons {
    @Id
    private String name;

    @Id
    private String surname;

    @Id
    private int age;
    @Column(name = "city_of_living", length = 50)
    private String city_of_living;

    @Column(name = "phone_number", length = 10)
    private int phoneNumber;
}
