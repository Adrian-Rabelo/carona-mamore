package com.rabelodev.caronaMamore.controller.dto;

import com.rabelodev.caronaMamore.entity.enums.Gender;

import java.util.Date;

public record CreatePassengerDto(String name,
                                 String cpf,
                                 String rg,
                                 Date birthDate,
                                 Gender gender,
                                 String email,
                                 String username,
                                 String password,
                                 String street,
                                 String neighborhood,
                                 String houseNumber,
                                 String phoneNumber,
                                 byte[] photo) {
}
