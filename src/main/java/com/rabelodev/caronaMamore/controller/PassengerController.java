package com.rabelodev.caronaMamore.controller;

import com.rabelodev.caronaMamore.controller.dto.CreatePassengerDto;
import com.rabelodev.caronaMamore.entity.Passenger;
import com.rabelodev.caronaMamore.repository.PassengerRepository;
import com.rabelodev.caronaMamore.service.PassengerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/passenger")
public class PassengerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PassengerController.class);

    @Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    private PassengerService passengerService;

    @PostMapping("/create")
    public ResponseEntity<Passenger> createPassenger(@RequestBody CreatePassengerDto passengerDto) {
        LOGGER.info("Creating passenger {}", passengerDto.username());

        var passengerId = passengerService.createPassenger(passengerDto);

        return ResponseEntity.created(URI.create("/user/create/" + passengerId.toString())).build();
    }
}
