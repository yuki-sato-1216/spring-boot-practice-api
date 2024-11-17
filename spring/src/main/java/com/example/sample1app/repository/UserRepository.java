package com.example.sample1app.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;

import com.example.sample1app.entity.UserEntity;

// @Repository
// public interface UserRepository extends JpaRepository<UserEntity, Integer> {
// }

// @Repositoryを使わず一旦シンプルなインターフェースで
@Component
public class UserRepository implements UserRepositoryInterface {
  public List<UserEntity> findAll() {
    // スタブ
    return IntStream.range(1, 10)
      .mapToObj(i -> new UserEntity(i, "user" + i, "user" + i + "@example.com", true))
      .collect(Collectors.toList());
  }
}
