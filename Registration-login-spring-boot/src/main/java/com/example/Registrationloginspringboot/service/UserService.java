package com.example.Registrationloginspringboot.service;

import com.example.Registrationloginspringboot.model.User;
import com.example.Registrationloginspringboot.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto userRegistrationDto);
}
