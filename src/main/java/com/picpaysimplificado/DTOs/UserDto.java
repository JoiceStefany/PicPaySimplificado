package com.picpaysimplificado.DTOs;

import java.math.BigDecimal;

import com.picpaysimplificado.Domin.UserType;

public record UserDto(String firstName, String lastName, String document, BigDecimal balance, String email,
    String password, UserType userType) {
    
}
