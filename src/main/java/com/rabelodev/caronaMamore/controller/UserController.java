package com.rabelodev.caronaMamore.controller;

import com.rabelodev.caronaMamore.controller.dto.CreateUserDTO;
import com.rabelodev.caronaMamore.dto.UserDTO;
import com.rabelodev.caronaMamore.entity.User;
import com.rabelodev.caronaMamore.repository.UserRepository;
import com.rabelodev.caronaMamore.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository repository;

    @Autowired
    private UserService service;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody CreateUserDTO userDTO) throws Exception {
        LOGGER.info("Creating a new user");
        User createdUser = service.createUser(userDTO);
        return ResponseEntity.ok(createdUser);
    }

    @GetMapping()
    public ResponseEntity<List<User>> getUsers() {
        LOGGER.info("Listing all users");
        var listAll = service.getUsers();
        return ResponseEntity.ok(listAll);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User updateUser) {
//        Optional<User> updatedUser = service.updateUser(id, updateUser);
//
//        return updatedUser.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
        return ResponseEntity.ok().build();

    }

    // TODO: CREATE SELF DELETE ACCOUNT
}
