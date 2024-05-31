package com.rabelodev.caronaMamore.controller.dto;

import java.util.UUID;

public record CarDto(UUID carId,
                     String brand,
                     String model,
                     String color,
                     String year) {
}
