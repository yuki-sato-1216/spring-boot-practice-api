package com.example.sample1app.usecase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample1app.dto.UserDto;
import com.example.sample1app.service.UserService;

@Service
public class UserUsecase implements UserUsecaseInterface {
    @Autowired
    UserService service;

    public List<UserDto> getUsers() {
        return service.findUserList();
    }
}
