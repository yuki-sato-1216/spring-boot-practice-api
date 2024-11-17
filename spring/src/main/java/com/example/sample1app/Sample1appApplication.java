package com.example.sample1app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample1app.repository.UserRepository;

@SpringBootApplication
@RestController
public class Sample1appApplication {

  @Autowired
  UserRepository userRepository;

  @RequestMapping("/")
  public String home() {
    return "Hello World";
  }

  public static void main(String[] args) {
    SpringApplication.run(Sample1appApplication.class, args);
  }
}
