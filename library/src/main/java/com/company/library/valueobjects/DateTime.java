package com.company.library.valueobjects;

import com.company.library.annotations.ValueObject;

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

  public static DateTime of(LocalDateTime value) {
    return new DateTime(value);
  }
}
