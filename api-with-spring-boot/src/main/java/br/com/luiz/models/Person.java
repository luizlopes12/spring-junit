package br.com.luiz.models;

import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "person")
public class Person  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", nullable = false, length = 80)
    private String firstName;
    @Column(name = "last_name", nullable = false, length = 80)
    private String lastName;
    @Column(name = "gender", nullable = false, length = 80)
    private String gender;

    public Person(String gender, String lastName, String firstName, Long id) {
        this.gender = gender;
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, gender);
    }

    public Person(){

    }
}
