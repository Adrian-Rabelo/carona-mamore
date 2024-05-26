package com.rabelodev.caronaMamore.service;

import com.rabelodev.caronaMamore.dto.DriverDTO;
import com.rabelodev.caronaMamore.entity.Driver;
import com.rabelodev.caronaMamore.repository.DriverRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverService {
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(DriverService.class);
//
//    @Autowired
//    private DriverRepository repository;
//
//    public List<DriverDTO> getDrivers() {
//        return repository.findAllDtoByOrderByIdAsc();
//    }
//
//    /**
//     * Create new driver and saves on database after validation
//     *
//     * @param driver
//     * @return saved driver
//     */
//    public Driver createDriver(Driver driver) {
//        validateDriver(driver);
//
//        return repository.save(driver);
//    }
//
//    private void validateDriver(Driver driver) {
//        LOGGER.info("Validating driver: " + driver.getName());
//
//        if (driver.getCnh() == null || driver.getCnh().isEmpty()) {
//            // TODO: Create brazillian validation for cnh
//            throw new IllegalStateException("Invalid national driver license");
//        }
//
//        if (driver.getCarLicensePlate() == null || driver.getCarLicensePlate().isEmpty()) {
//            throw new IllegalStateException("Invalid driver licence plate");
//        }
//
//        // TODO: Finish validate driver method;
//    }
//
//    /**
//     * Update driver datas
//     *
//     * @param id
//     * @param driver
//     * @return
//     */
//
//    public Optional<Driver> updateDriver(Long id, Driver driver) {
//        // TODO: create validation method for fields (?)
//        return repository.findById(id)
//            .map(existingUser -> {
//                existingUser.setName(driver.getName());
//                existingUser.setEmail(driver.getEmail());
//                existingUser.setUsername(driver.getUsername());
//                existingUser.setCnh(driver.getCnh());
//                existingUser.setCarColor(driver.getCarColor());
//                existingUser.setCarModel(driver.getCarModel());
//                existingUser.setCarLicensePlate(driver.getCarLicensePlate());
//                existingUser.setStreet(driver.getStreet());
//                existingUser.setNeighborhood(driver.getNeighborhood());
//                existingUser.setHouseNumber(driver.getHouseNumber());
//
//                return repository.save(existingUser);
//            });
//    }
}
