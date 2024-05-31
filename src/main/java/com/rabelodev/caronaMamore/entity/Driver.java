package com.rabelodev.caronaMamore.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "drivers")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", unique = true)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "rg", nullable = false, unique = true)
    private String rg;

    @Column(name = "national_driving_license", nullable = false, unique = true)
    private String cnh;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "gender")
    private String gender;

    @Column(name = "email")
    private String email;

    // TODO : Create auto blob generation for username (user-name, jhon-doe)
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "car_license_plate")
    private String carLicensePlate;

    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToOne()
    private Car car;

    @Column(name = "photo")
    private byte[] photo;

    @Column(name = "created_at")
    @CreationTimestamp
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date updatedAt;


}
