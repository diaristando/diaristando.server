package br.org.diaristando.entity.person;

import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Person {

    @Id
    protected UUID id;

    protected String fullName;

    protected String email;

    protected String CPF;

    protected String cellphone;

    protected String postCode;

    protected String nickname;

    protected LocalDate birthday;

    public Person(UUID id, String fullName, String email, String CPF, String cellphone, String postCode, String nickname, LocalDate birthday) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.CPF = CPF;
        this.cellphone = cellphone;
        this.postCode = postCode;
        this.nickname = nickname;
        this.birthday = birthday;
    }

    public Person() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(email, person.email) && Objects.equals(CPF, person.CPF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, CPF);
    }
}
