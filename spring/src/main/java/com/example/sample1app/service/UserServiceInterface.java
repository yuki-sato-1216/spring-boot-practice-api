package com.example.sample1app.service;

import java.util.List;

import com.example.sample1app.dto.UserDto;

public interface UserServiceInterface {
    List<UserDto> findUserList();
}