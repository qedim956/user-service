package com.company.user.service.container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.company.user.service.secondary.dataaccess.entity")
public class UserService {
  public static void main(String[] args) {
    SpringApplication.run(UserService.class, args);
  }
}
