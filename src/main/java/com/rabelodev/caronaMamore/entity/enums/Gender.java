package com.rabelodev.caronaMamore.entity.enums;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum Gender {

    FEMALE("Feminino", "FEM"),
    MALE("Masculino", "MAS");

    private String description;
    private String abbreviation;

    public static Gender parse(String abbreviation) {
        for (Gender item : Gender.values()) {
            if (item.getAbbreviation().equalsIgnoreCase(abbreviation)) {
                return item;
            }
        }

        return null;
    }

}
