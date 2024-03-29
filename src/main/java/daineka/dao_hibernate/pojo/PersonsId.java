package daineka.dao_hibernate.pojo;

import java.io.Serializable;
import java.util.Objects;

public class PersonsId implements Serializable {
    private String name;
    private String surname;
    private int age;

    public PersonsId() {
    }

    public PersonsId(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonsId personsId = (PersonsId) o;
        return age == personsId.age &&
                Objects.equals(name, personsId.name) &&
                Objects.equals(surname, personsId.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
