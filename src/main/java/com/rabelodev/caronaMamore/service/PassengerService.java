package com.rabelodev.caronaMamore.service;

import com.rabelodev.caronaMamore.controller.dto.CreatePassengerDto;
import com.rabelodev.caronaMamore.entity.Passenger;
import com.rabelodev.caronaMamore.repository.PassengerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PassengerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PassengerService.class);

    @Autowired
    private PassengerRepository passengerRepository;

    public PassengerService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    public UUID createPassenger(CreatePassengerDto passengerDto) {

        var passenger = Passenger.builder()
            .name(passengerDto.name())
            .cpf(passengerDto.cpf())
            .rg(passengerDto.rg())
            .gender(passengerDto.gender().getDescription())
            .birthDate(passengerDto.birthDate())
            .email(passengerDto.email())
            .username(passengerDto.username())
            .password(passengerDto.password())
            .street(passengerDto.street())
            .neighborhood(passengerDto.neighborhood())
            .houseNumber(passengerDto.houseNumber())
            .phoneNumber(passengerDto.phoneNumber())
            .photo(passengerDto.photo())
            .build();

        var savedPassenger = passengerRepository.save(passenger);

        return savedPassenger.getId();
    }
}
