package com.rabelodev.caronaMamore.controller;

import com.rabelodev.caronaMamore.entity.User;
import com.rabelodev.caronaMamore.repository.UserRepository;
import com.rabelodev.caronaMamore.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController extends AbstractController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository repository;

    @Autowired
    private UserService service;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) throws Exception {
        LOGGER.info("Creating a new user");
        return service.createUser(user);
    }

}
