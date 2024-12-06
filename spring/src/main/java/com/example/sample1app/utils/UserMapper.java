package com.example.sample1app.utils;

import org.springframework.stereotype.Component;

import com.example.sample1app.dto.UserDto;
import com.example.sample1app.entity.UserEntity;

@Component
public class UserMapper {
    public UserDto mapToDto(UserEntity entity) {
        return new UserDto(entity.getId(), entity.getName(), entity.getEmail(), entity.isActive());
    }
}