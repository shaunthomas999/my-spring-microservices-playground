package com.shaunthomas999.greetings.services;

import com.shaunthomas999.greetings.models.Greeting;
import com.shaunthomas999.greetings.repositories.GreetingsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GreetingsService {

  private final GreetingsRepository greetingsRepository;

  public List<String> getGreetings() {
    return greetingsRepository.findAll()
        .stream()
        .map(Greeting::getText)
        .toList();
  }
}
