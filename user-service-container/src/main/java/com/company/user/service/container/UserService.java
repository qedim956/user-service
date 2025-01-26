package com.company.user.service.container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(
        scanBasePackages = {
                "com.company.user.service.container",
                "com.company.user.service.domain.core",
                "com.company.user.service.domain.shell",
                "com.company.user.service.primary.web",
                "com.company.user.service.secondary.dataaccess",
                "com.company.user.service.library",

        })
@ComponentScan(basePackages = {
"com.company.user.service"
})
@EntityScan(basePackages = "com.company")
@EnableJpaRepositories(basePackages = {"com.company.user.service.secondary.dataaccess.repository"})
@EnableTransactionManagement
public class UserService {
  public static void main(String[] args) {
    SpringApplication.run(UserService.class, args);
  }
}
