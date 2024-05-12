package com.rabelodev.caronaMamore.dto;

import java.time.LocalDateTime;

public interface UserDTO {
    String getName();
    String getEmail();
    String getLogin();
    LocalDateTime getCreatedAt();
    LocalDateTime getUpdatedAt();

}
