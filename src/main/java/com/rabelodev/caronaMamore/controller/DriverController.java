package com.rabelodev.caronaMamore.controller;

import com.rabelodev.caronaMamore.dto.DriverDTO;
import com.rabelodev.caronaMamore.entity.Driver;
import com.rabelodev.caronaMamore.repository.DriverRepository;
import com.rabelodev.caronaMamore.service.DriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/driver")
public class DriverController {

//    private static final Logger LOGGER = LoggerFactory.getLogger(DriverController.class);
//
//    @Autowired
//    private DriverRepository repository;
//
//    @Autowired
//    private DriverService service;
//
//    @PostMapping("/create")
//    public Driver createDriver(@RequestBody Driver driver) throws Exception {
//        LOGGER.info("Creating driver");
//
//        return service.createDriver(driver);
//    }
//
//    @GetMapping()
//    public List<DriverDTO> getDrivers() {
//        LOGGER.info("Listing all drivers");
//        return service.getDrivers();
//
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Driver> updateDriver(@PathVariable Long id, @RequestBody Driver updateDriver) {
//        Optional<Driver> updatedDriver = service.updateDriver(id, updateDriver);
//
//        return updatedDriver.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
//    }

}
