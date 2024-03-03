package daineka.dao_hibernate;

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

    private String cityOfLiving;

    @Column(name = "phone_number", length = 10)
    private int phoneNumber;
}
