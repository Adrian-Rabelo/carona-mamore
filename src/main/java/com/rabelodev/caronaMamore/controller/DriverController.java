package com.rabelodev.caronaMamore.controller;

import com.rabelodev.caronaMamore.controller.dto.CreateDriverDto;
import com.rabelodev.caronaMamore.entity.Driver;
import com.rabelodev.caronaMamore.entity.User;
import com.rabelodev.caronaMamore.repository.DriverRepository;
import com.rabelodev.caronaMamore.service.DriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/driver")
public class DriverController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DriverController.class);

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private DriverService driverService;


    // TODO: Refinar lógica da criação de motorista
    @PostMapping("/create")
    public ResponseEntity<Driver> createDriver(@RequestBody CreateDriverDto driverDto) throws Exception {
        LOGGER.info("Creating driver");

        var driverId = driverService.createDriver(driverDto);

        return ResponseEntity.created(URI.create("/driver/create" + driverId.toString())).build();
    }

    @GetMapping()
    public ResponseEntity<List<Driver>> getDrivers() {
        LOGGER.info("Listing all drivers");
        var listAll = driverService.getDrivers();

        return ResponseEntity.ok(listAll);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Driver> updateDriver(@PathVariable UUID id, @RequestBody Driver updateDriver) {
        Optional<Driver> updatedDriver = driverService.updateDriver(id, updateDriver);

        return updatedDriver.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

}
