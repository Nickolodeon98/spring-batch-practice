package com.example.springbatchpractice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Person {
  private String lastName;
  private String firstName;

  @Override
  public String toString() {
    return "firstName: " + firstName + ", lastName: " + lastName;
  }
}
