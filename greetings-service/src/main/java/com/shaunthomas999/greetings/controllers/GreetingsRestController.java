package com.shaunthomas999.greetings.controllers;

import com.shaunthomas999.greetings.services.GreetingsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/greetings")
@RequiredArgsConstructor
public class GreetingsRestController {

  private final GreetingsService greetingsService;

  @GetMapping
  public ResponseEntity<List<String>> getGreetings() {
    return ResponseEntity.ok(greetingsService.getGreetings());
  }
}
