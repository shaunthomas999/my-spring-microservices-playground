package com.shaunthomas999.names;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class NamesServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(NamesServiceApplication.class, args);
  }
}
