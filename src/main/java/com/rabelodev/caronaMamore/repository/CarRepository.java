package com.rabelodev.caronaMamore.repository;

import com.rabelodev.caronaMamore.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CarRepository extends JpaRepository<Car, UUID> {
}
