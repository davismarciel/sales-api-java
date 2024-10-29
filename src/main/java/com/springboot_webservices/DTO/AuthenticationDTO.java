package com.springboot_webservices.DTO;

import com.springboot_webservices.entities.enums.UserRole;

public record AuthenticationDTO(String email, String password, UserRole role) {

}
