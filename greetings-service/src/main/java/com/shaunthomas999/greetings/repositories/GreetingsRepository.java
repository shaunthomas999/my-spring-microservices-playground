package com.shaunthomas999.greetings.repositories;

import com.shaunthomas999.greetings.models.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GreetingsRepository extends JpaRepository<Greeting, UUID> {
}
