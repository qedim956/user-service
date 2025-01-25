package com.company.user.service.library.valueobjects;

import com.company.user.service.library.annotations.ValueObject;

import java.time.LocalDateTime;

@ValueObject
public final class DateTime {
  private final LocalDateTime value;

  private DateTime(LocalDateTime value) {
    this.value = value;
  }

  public LocalDateTime value() {

    return value;
  }

  public static DateTime now() {
    return new DateTime(LocalDateTime.now());
  }

  public static DateTime of(LocalDateTime value) {
    return new DateTime(value);
  }
}
