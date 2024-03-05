package daineka.dao_hibernate.entity;

import daineka.dao_hibernate.pojo.PersonsId;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity(name = "persons") // наименование таблицы
@Builder
@NoArgsConstructor
@AllArgsConstructor
@IdClass(PersonsId.class)
public class PersonEntity {
    @Id
    @Column(name = "name", length = 20)
    private String name;

    @Id
    @Column(name = "surname", length = 30)
    private String surname;

    @Id
    @Column(name = "age", length = 50)
    @Max(130)
    private int age;

    @Column(name = "city_of_living", length = 50)
    private String city_of_living;

    @Column(name = "phone_number", length = 10)
    private int phone_number;
}
