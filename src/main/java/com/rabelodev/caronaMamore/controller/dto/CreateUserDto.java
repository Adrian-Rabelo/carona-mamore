package com.rabelodev.caronaMamore.controller.dto;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
public record CreateUserDTO(String name,
                            String cpf,
                            String rg,
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
