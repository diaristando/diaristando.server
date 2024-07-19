package br.org.diaristando.entity.person;

import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class HouseKeeper extends Person{
    public HouseKeeper(UUID id, String fullName, String email, String CPF, String cellphone, String postCode, String nickname, LocalDate birthday) {
        super(id, fullName, email, CPF, cellphone, postCode, nickname, birthday);
    }

    public HouseKeeper() {
        super();
    }


}
