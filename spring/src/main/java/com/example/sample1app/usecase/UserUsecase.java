package com.example.sample1app.usecase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.sample1app.dto.UserDto;
import com.example.sample1app.service.UserService;

@Component
public class UserUsecase implements UserUsecaseInterface {
    @Autowired
    UserService service;

    public List<UserDto> findUserList() {
        return service.findUserList();
    }
}
