package com.springboot2.newfeature.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class People {

  private String name;
  private Integer age;

  @JsonIgnore
  private String address;

  // @JsonProperty("r_date")
  private LocalDateTime registerDate;

}
