package com.shaunthomas999.greetings.services;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingsCacheService {

  @Cacheable("addresses")
  public List<String> getGreetings() {
    return List.of("Hello", "Hola");
  }
}
