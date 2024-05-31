package com.rabelodev.caronaMamore.service;

import com.rabelodev.caronaMamore.controller.dto.CreateDriverDto;
import com.rabelodev.caronaMamore.controller.dto.CreateUserDto;
import com.rabelodev.caronaMamore.entity.Car;
import com.rabelodev.caronaMamore.entity.Driver;
import com.rabelodev.caronaMamore.entity.User;
import com.rabelodev.caronaMamore.exceptions.NullPasswordException;
import com.rabelodev.caronaMamore.repository.CarRepository;
import com.rabelodev.caronaMamore.repository.DriverRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DriverService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DriverService.class);

    @Autowired
    private DriverRepository driverRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private CarRepository carRepository;

    public List<Driver> getDrivers() {
        return driverRepository.findAllDtoByOrderByIdAsc();
    }

    /**
     * Create new driver and saves on database after validation
     *
     * @param driver
     * @return saved driver
     */
    public UUID createDriver(CreateDriverDto driverDto) {

        var driver = Driver.builder()
            .name(driverDto.name())
            .cpf(driverDto.cpf())
            .rg(driverDto.rg())
            .cnh(driverDto.cnh())
            .birthDate(driverDto.birthDate())
            .gender(driverDto.gender().getDescription())
            .email(driverDto.email())
            .username(driverDto.username())
            .password(driverDto.password())
            .carLicensePlate(driverDto.carLicensePlate())
            .phoneNumber(driverDto.phoneNumber())
            .photo(driverDto.photo())
            .build();

        if (driverDto.car() != null) {
            var carDto = driverDto.car();
            Car car;
            if (carDto.carId() != null) {
                car = carRepository.findById(carDto.carId())
                    .orElseThrow(() -> new RuntimeException("Car not found"));
            } else {
                car = Car.builder()
                    .model(carDto.model())
                    .brand(carDto.brand())
                    .color(carDto.color())
                    .year(carDto.year())
                    .build();
                car = carRepository.save(car);
            }
            driver.setCar(car);
        }

        var driverSaved = driverRepository.save(driver);

        return driverSaved.getId();

    }

    private void validateDriver(Driver driver) {
        LOGGER.info("Validating driver: " + driver.getName());

        if (driver.getCnh() == null || driver.getCnh().isEmpty()) {
            // TODO: Create brazillian validation for cnh
            throw new IllegalStateException("Invalid national driver license");
        }

        if (driver.getCarLicensePlate() == null || driver.getCarLicensePlate().isEmpty()) {
            throw new IllegalStateException("Invalid driver licence plate");
        }

        // TODO: Finish validate driver method;
    }

    /**
     * Update driver datas
     *
     * @param id
     * @param driver
     * @return
     */

    public Optional<Driver> updateDriver(UUID uuid, Driver driver) {
        // TODO: create validation method for fields (?)
        return driverRepository.findById(uuid)
            .map(existingUser -> {
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

                return driverRepository.save(existingUser);
            });
    }
}
