package com.example.sample1app.repository;

import java.util.List;
import com.example.sample1app.entity.UserEntity;

public interface UserRepositoryInterface {
  public List<UserEntity> findAll();
}
