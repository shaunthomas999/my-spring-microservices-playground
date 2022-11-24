package com.shaunthomas999.greetings.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name="Greetings")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Greeting {

  @NotNull
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(nullable = false)
  private UUID id;

  @NotBlank
  @Column(nullable = false, unique = true)
  String text;

  @NotBlank
  @Column(nullable = false, unique = true)
  String language;

  @FutureOrPresent
  @CreatedDate
  LocalDateTime createdAt;

  @FutureOrPresent
  @LastModifiedDate
  LocalDateTime modifiedAt;
}
