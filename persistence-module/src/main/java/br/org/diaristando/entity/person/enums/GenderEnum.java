package br.org.diaristando.entity.person.enums;

public enum GenderEnum {
    MALE("masculino"),
    FEMALE("feminino"),
    UNDEFINED("não especificado");

    private String genderName;

    private GenderEnum(String genderName) {
        this.genderName = genderName;
    }

    private String getGenderName() {
        return this.genderName;
    }
}
