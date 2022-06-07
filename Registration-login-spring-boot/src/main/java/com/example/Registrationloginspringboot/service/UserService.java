package com.example.Registrationloginspringboot.service;

import com.example.Registrationloginspringboot.model.User;
import com.example.Registrationloginspringboot.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
