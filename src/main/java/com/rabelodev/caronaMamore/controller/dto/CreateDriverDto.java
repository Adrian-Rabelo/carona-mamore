package com.rabelodev.caronaMamore.controller.dto;

import com.rabelodev.caronaMamore.entity.Car;
import com.rabelodev.caronaMamore.entity.User;
import com.rabelodev.caronaMamore.entity.enums.Gender;

import java.util.Date;
import java.util.UUID;

public record CreateDriverDto(String name,
                              String cpf,
                              String rg,
                              String cnh,
                              Date birthDate,
                              Gender gender,
                              String email,
                              String username,
                              String password,
                              String carLicensePlate,
                              String phoneNumber,
                              CarDto car,

                              byte[] photo) {
}
