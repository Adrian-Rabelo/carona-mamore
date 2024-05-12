package com.rabelodev.caronaMamore.repository;

import com.rabelodev.caronaMamore.dto.UserDTO;
import com.rabelodev.caronaMamore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByNameLike(String name);

    List<UserDTO> findAllDtoBy();
}