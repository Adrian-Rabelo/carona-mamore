package com.rabelodev.caronaMamore.repository;

import com.rabelodev.caronaMamore.dto.DriverDTO;
import com.rabelodev.caronaMamore.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

//    List<DriverDTO> findAllDtoByOrderByIdAsc();
}
