package com.rabelodev.caronaMamore.repository;

import com.rabelodev.caronaMamore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    List<User> findByNameLike(String name);

    List<User> findAllDtoByOrderByIdAsc();
}
