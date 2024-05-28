package com.rabelodev.caronaMamore.controller.dto;

import com.rabelodev.caronaMamore.entity.enums.Gender;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record CreateUserDto(String name,
                            String cpf,
                            String rg,
                            Gender gender,
                            LocalDateTime bornDate,
                            String email,
                            String username,
                            String password,
                            String street,
                            String neighborhood,
                            String houseNumber,
                            String phoneNumber,
                            byte[] photo) {
}
