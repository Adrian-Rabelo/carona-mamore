package com.rabelodev.caronaMamore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "drivers")
public class Driver extends User {

    @Column(name = "national_driving_license")
    private String cnh;

    @Column(name = "car_year")
    private String carYear;

    @Column(name = "car_brand")
    private String carBrand;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "car_color")
    private String carColor;

    @Column(name = "car_license_plate")
    private String carLicensePlate;
    
}
