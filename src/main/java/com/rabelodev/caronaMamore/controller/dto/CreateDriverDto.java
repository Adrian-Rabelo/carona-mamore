package com.rabelodev.caronaMamore.controller.dto;

import com.rabelodev.caronaMamore.entity.User;

import java.util.UUID;

public record CreateDriverDto(UUID userId,
                              String cnh,
                              String carYear,
                              String carBrand,
                              String carModel,
                              String carColor,
                              String carLicensePlate) {
}
