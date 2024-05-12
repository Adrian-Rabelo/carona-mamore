package com.rabelodev.caronaMamore.service;

import com.rabelodev.caronaMamore.controller.UserController;
import com.rabelodev.caronaMamore.entity.User;
import com.rabelodev.caronaMamore.exceptions.NullPasswordException;
import com.rabelodev.caronaMamore.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository repository;

    /***
     * Create a new user and saves on database
     * @param repository
     * @param createUser
     * @return 200 OK Response and create a new user
     * @throws NullPasswordException
     */
    public User createUser(User createUser) throws NullPasswordException {
        validateUser(createUser);

        return repository.save(createUser);
    }

    /***
     * Validates user data
     * @param user
     * @throws NullPasswordException
     */
    private void validateUser(User user) throws NullPasswordException {
        LOGGER.info("Validating user: " + user);


        if (user.getName() == null || user.getName().isEmpty()) {
            throw new IllegalArgumentException("Invalid username");
        }

        if (user.getLogin() == null || user.getLogin().isEmpty()) {
            throw new IllegalArgumentException("Invalid login");
        }

        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            throw new IllegalArgumentException("Invalid password");
        }
    }
}
