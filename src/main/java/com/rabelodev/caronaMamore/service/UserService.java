package com.rabelodev.caronaMamore.service;

import com.rabelodev.caronaMamore.controller.UserController;
import com.rabelodev.caronaMamore.controller.dto.CreateUserDTO;
import com.rabelodev.caronaMamore.entity.User;
import com.rabelodev.caronaMamore.exceptions.NullPasswordException;
import com.rabelodev.caronaMamore.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Create a new user and saves on database
     *
     * @param repository
     * @param createUser
     * @return 200 OK Response and create a new user
     * @throws NullPasswordException
     */
    public User createUser(CreateUserDTO createUserDTO) throws NullPasswordException {
        var user = User.builder()
            .name(createUserDTO.name())
            .cpf(createUserDTO.cpf())
            .rg(createUserDTO.rg())
            .bornDate(createUserDTO.bornDate())
            .email(createUserDTO.email())
            .username(createUserDTO.username())
            .password(createUserDTO.password())
            .street(createUserDTO.street())
            .neighborhood(createUserDTO.neighborhood())
            .houseNumber(createUserDTO.houseNumber())
            .phoneNumber(createUserDTO.phoneNumber())
            .photo(createUserDTO.photo())
            .build();

        return userRepository.save(user);
    }

    public List<User> getUsers() {

        return userRepository.findAllDtoByOrderByUuidAsc();
    }

    public Optional<User> updateUser(UUID uuid, User updateUser) {
        return userRepository.findById(uuid)
            .map(existingUser -> {
                existingUser.setName(updateUser.getName());
                existingUser.setEmail(updateUser.getEmail());
                existingUser.setUsername(updateUser.getUsername());

                return userRepository.save(existingUser);
            });
    }

    /**
     * Validates user data
     *
     * @param user
     * @throws NullPasswordException
     */
    private void validateUser(User user) throws NullPasswordException {
        LOGGER.info("Validating user: " + user);


        if (user.getName() == null || user.getName().isEmpty()) {
            throw new IllegalArgumentException("Invalid username");
        }

        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            throw new IllegalArgumentException("Invalid login");
        }

        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            throw new IllegalArgumentException("Invalid password");
        }
    }

}
