package com.example.sample1app.usecase;

import java.util.List;

import com.example.sample1app.dto.UserDto;

public interface UserUsecaseInterface {
    List<UserDto> findUserList();
}