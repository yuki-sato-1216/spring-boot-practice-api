package com.example.sample1app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample1app.dto.UserDto;
import com.example.sample1app.usecase.UserUsecase;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	UserUsecase usecase;

	@GetMapping
	public ResponseEntity<List<UserDto>> invoke() {
		final List<UserDto> users = this.usecase.getUsers();
		return ResponseEntity.ok(users);
	}
}